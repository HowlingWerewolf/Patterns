package org.example.patterns.creational.builder.withoutpattern;

import lombok.extern.java.Log;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@Log
public class BuilderDemo {

    private static final int WHEEL_RADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    public static void main(final String[] args) {
        final Car car = new Car();

        final Engine engine = Engine.V6;
        car.setEngine(engine);

        final List<Tyre> tyres = new ArrayList<>(4);
        final Tyre tyre = new Tyre();
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

        log.info(car.toString());
    }
    
}
