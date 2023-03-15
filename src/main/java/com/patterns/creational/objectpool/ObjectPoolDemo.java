package com.patterns.creational.objectpool;

import com.patterns.creational.objectpool.entity.Resource;

import java.sql.Timestamp;
import java.util.Date;

public class ObjectPoolDemo {

    public static void main(String[] args) throws InterruptedException {
        final ObjectPool objectPool = new ObjectPool();
        for (int i = 0; i < 6; i++) {
            final int taskNr = i;
            final Thread thread = new Thread(() -> {
                try {
                    System.out.println(Timestamp.from(new Date().toInstant()) + " - Initializing TASK " + taskNr);
                    Resource resource = objectPool.getResource();
                    while (resource == null) {
                        System.out.println(Timestamp.from(new Date().toInstant()) + " - Waiting for resource at TASK " + taskNr);
                        Thread.sleep(2000);
                        resource = objectPool.getResource();
                    }
                    System.out.println(Timestamp.from(new Date().toInstant()) + " - Starting TASK " + taskNr);
                    resource.startTask("TASK " + taskNr, 5000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
            Thread.sleep(1000);
        }
    }

}
