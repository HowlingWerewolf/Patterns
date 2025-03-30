package org.example.patterns.creational.objectpool;

import lombok.extern.java.Log;
import org.example.patterns.creational.objectpool.entity.Resource;
import org.example.patterns.creational.objectpool.util.TimestampHelper;

import java.util.*;

@Log
public class ObjectPool {

    static ObjectPool instance;

    private int MAX_SIZE = 2;

    final List<Resource> available = Collections.synchronizedList(new ArrayList<>());
    final List<Resource> unavailable = Collections.synchronizedList(new ArrayList<>());

    private ObjectPool() {}

    public static ObjectPool getInstance() {
        if (instance == null) {
            instance = new ObjectPool();
        }
        return instance;
    }

    public synchronized Resource getIdleResource(final long executionTimeInMillis) {
        final Optional<Resource> idleResource = available.stream().findFirst();
        if (idleResource.isPresent()) {
            return getIdleResource(executionTimeInMillis, idleResource.get());
        }

        final int count = available.size() + unavailable.size();
        if (count < MAX_SIZE) {
            return createResource(executionTimeInMillis, count);
        }

        return null;
    }

    private synchronized Resource getIdleResource(final long executionTimeInMillis,
                                                  final Resource idleResource) {
        log.info(TimestampHelper.get() + "Idling resource found: " + idleResource.getName());
        available.remove(idleResource);
        unavailable.add(idleResource);
        expire(idleResource, executionTimeInMillis);
        return idleResource;
    }

    private synchronized Resource createResource(final long executionTimeInMillis,
                                                 final int count) {
        final String name = "R" + count;
        log.info(TimestampHelper.get() + "Pool is not full, adding a new resource with name " + name);
        Resource newResource = new Resource(name);
        unavailable.add(newResource);
        expire(newResource, executionTimeInMillis);
        return newResource;
    }

    public synchronized void expire(final Resource resource,
                                    final long executionTimeInMillis) {
        final Thread thread = new Thread(() -> {
            try {
                Thread.sleep(executionTimeInMillis);
                log.info(TimestampHelper.get() + resource.getName() + " finished with " + resource.getTaskName()
                        + " -> putting back as to available queue");
                unavailable.remove(resource);
                available.add(resource);
            } catch (final InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
    }

    public synchronized void removeResource(final Resource resource) {
        available.remove(resource);
    }

    public synchronized void setMaxSize(final int maxSize) {
        MAX_SIZE = maxSize;
    }

}
