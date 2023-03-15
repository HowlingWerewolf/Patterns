package com.patterns.creational.objectpool.entity;

public class Resource {

    private final String name;
    private String taskName;

    public Resource(String name) {
        this.name = name;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized String getTaskName() {
        return taskName;
    }

    public synchronized void setTaskName(final String taskName) {
        this.taskName = taskName;
    }

}
