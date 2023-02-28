package com.patterns.creational.builder.withoutPattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {

    private static final int RADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    public static void main(String[] args) {
        Car car = new Car();

        Engine engine = Engine.V6;
        car.setEngine(engine);

        List<Wheel> wheels = new ArrayList<>(4);
        Wheel wheel = new Wheel();
        wheel.setRadius(RADIUS);
        wheel.setWidth(WIDTH);
        wheel.setHeight(HEIGHT);
        wheels.add(wheel);
        wheels.add(wheel.copy());
        wheels.add(wheel.copy());
        wheels.add(wheel.copy());
        car.setWheels(wheels);


        Chassis chassis = new Chassis();
        chassis.setColor(Color.BLACK);
        chassis.setModelType("Opel Astra H");
        car.setChassis(chassis);

        System.out.println(car);
    }
    
}
