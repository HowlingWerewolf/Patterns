package com.patterns.creational.builder.withPattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {

    private static final int RADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    public static void main(String[] args) {
        Engine v6 = Engine.V6;

        List<Tyre> tyres = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            tyres.add(getWheel());
        }

        Chassis chassis = Chassis.builder()
                .color(Color.BLACK)
                .modelType("Opel Astra H")
                .build();

        Car car = Car.builder()
                .engine(v6)
                .wheels(tyres)
                .chassis(chassis)
                .build();

        System.out.println(car.toString());
        // if you reach this point you might be ultimately lazy
        // and use lombok's @Builder instead so
        // don't write manually Builders anymore
    }

    private static Tyre getWheel() {
        return Tyre.builder()
                .wheelRadius(RADIUS)
                .width(WIDTH)
                .height(HEIGHT)
                .build();
    }

}
