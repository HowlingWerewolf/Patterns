package org.example.patterns.creational.objectpool;

import lombok.extern.java.Log;
import org.example.patterns.creational.objectpool.entity.Resource;
import org.example.patterns.creational.objectpool.util.TimestampHelper;

import java.util.List;

@Log
public class ObjectPoolDemo {

    static long taskLength = 5000L;

    public static void main(final String[] args) throws InterruptedException {
        final ObjectPool objectPool = ObjectPool.getInstance();
        final List<String> tasks = List.of("TASK A", "TASK B", "TASK C", "TASK D", "TASK E", "TASK F");

        for (final String task : tasks) {
            final Thread thread = new Thread(() -> {
                try {
                    log.info(TimestampHelper.get() + "Initializing " + task);
                    Resource resource = objectPool.getIdleResource(taskLength);
                    while (resource == null) {
                        log.info(TimestampHelper.get() + "Waiting for resource at " + task);
                        Thread.sleep(3000);
                        resource = objectPool.getIdleResource(taskLength);
                    }
                    resource.setTaskName(task);
                    log.info(TimestampHelper.get() + "Starting " + task + " with " + resource.getName());
                } catch (final InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
            Thread.sleep(100);
        }
    }

}
