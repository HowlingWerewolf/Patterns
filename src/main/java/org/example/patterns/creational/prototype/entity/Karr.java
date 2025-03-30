package org.example.patterns.creational.prototype.entity;

public class Karr implements Car {

    @Override
    public Car cloneFromBlueprint() {
        return new Karr();
    }

}
