package com.patterns.creational.objectpool.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Resource {

    private Timer estimatedTimeLeft;
    private String name;

    public Resource(String name) {
        this.name = name;
        System.out.println("Resource created with name " + name);
    }
    public synchronized void startTask(final String taskMessage,
                          final long timeNeededToComplete) throws InterruptedException {
        estimatedTimeLeft = new Timer();
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(Timestamp.from(new Date().toInstant()) + " - " +
                        taskMessage + " task completed by " + name);
                estimatedTimeLeft = null;
            }
        };
        estimatedTimeLeft.schedule(task, timeNeededToComplete);
    }

    public synchronized boolean isAvailable() {
        return estimatedTimeLeft == null;
    }

}
