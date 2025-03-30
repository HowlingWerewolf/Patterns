package org.example.patterns.creational.prototype.entity;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Car> prototypes = new HashMap<>();

    static {
        prototypes.put("Kitt", new Kitt());
        prototypes.put("Karr", new Karr());
    }

    public static Car getPrototype(String carName) {
        Car car = prototypes.get(carName);
        return car == null ? null : car.cloneFromBlueprint();
    }

}
