package com.patterns.creational.builder.withoutPattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {

    private static final int WHEEL_RADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    public static void main(String[] args) {
        Car car = new Car();

        Engine engine = Engine.V6;
        car.setEngine(engine);

        List<Tyre> tyres = new ArrayList<>(4);
        Tyre tyre = new Tyre();
        tyre.setWheelRadius(WHEEL_RADIUS);
        tyre.setWidth(WIDTH);
        tyre.setHeight(HEIGHT);
        tyres.add(tyre);
        tyres.add(tyre.clone());
        tyres.add(tyre.clone());
        tyres.add(tyre.clone());
        car.setTyres(tyres);


        Chassis chassis = new Chassis();
        chassis.setColor(Color.BLACK);
        chassis.setModelType("Opel Astra H");
        car.setChassis(chassis);

        System.out.println(car);
    }
    
}
