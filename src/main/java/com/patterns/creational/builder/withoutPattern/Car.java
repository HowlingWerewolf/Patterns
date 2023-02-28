package com.patterns.creational.builder.withoutPattern;

import lombok.Setter;

import java.util.List;

@Setter
public class Car {

    Engine engine;
    List<Wheel> wheels;
    Chassis chassis;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", chassis=" + chassis +
                '}';
    }

}
