package com.patterns.creational.prototype.entity;

public class Karr implements Car {

    @Override
    public Car cloneFromBlueprint() {
        return new Karr();
    }

}
