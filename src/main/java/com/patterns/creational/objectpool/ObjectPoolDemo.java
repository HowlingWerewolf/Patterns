package com.patterns.creational.objectpool;

import com.patterns.creational.objectpool.entity.Resource;
import com.patterns.creational.objectpool.util.TimestampHelper;

import java.util.List;

public class ObjectPoolDemo {

    public static long taskLength = 5000L;

    public static void main(String[] args) throws InterruptedException {
        final ObjectPool objectPool = new ObjectPool();
        final List<String> tasks = List.of("TASK A", "TASK B", "TASK C", "TASK D", "TASK E", "TASK F");

        for (String task : tasks) {
            final Thread thread = new Thread(() -> {
                try {
                    System.out.println(TimestampHelper.get() + "Initializing " + task);
                    Resource resource = objectPool.getIdleResource(taskLength);
                    while (resource == null) {
                        System.out.println(TimestampHelper.get() + "Waiting for resource at " + task);
                        Thread.sleep(3000);
                        resource = objectPool.getIdleResource(taskLength);
                    }
                    resource.setTaskName(task);
                    System.out.println(TimestampHelper.get() + "Starting " + task);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
            Thread.sleep(100);
        }
    }

}
