package com.patterns.creational.prototype.entity;

public class Kitt implements Car {

    @Override
    public Car cloneFromBlueprint() {
        return new Kitt();
    }

}
