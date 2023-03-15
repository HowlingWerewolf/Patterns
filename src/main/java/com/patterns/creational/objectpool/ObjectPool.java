package com.patterns.creational.objectpool;

import com.patterns.creational.objectpool.entity.Resource;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

// TODO Make this singleton
public class ObjectPool {

    private int MAX_SIZE = 2;

    public List<Resource> resources = new ArrayList<>();

    public synchronized Resource getResource() {
        System.out.println("Size of pool: " + resources.size());
        System.out.println("Content of pool: " + resources);

        final Optional<Resource> idleResource = resources.stream().filter(Resource::isAvailable).findFirst();
        if (idleResource.isPresent()) {
            System.out.println("Already present idling resource found: " + idleResource.get());
            return idleResource.get();
        }

        if (resources.size() < MAX_SIZE) {
            Resource newResource = new Resource(resources.size() + " - " + Timestamp.from(new Date().toInstant()));
            resources.add(newResource);
            return newResource;
        }

        return null;
    }

    public synchronized void removeResource(final Resource resource) {
        resources.remove(resource);
    }

    public synchronized void setMaxSize(final int maxSize) {
        MAX_SIZE = maxSize;
    }

}
