package org.example.patterns.creational.builder.withpattern;

import lombok.extern.java.Log;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@Log
public class BuilderDemo {

    private static final int WHEELRADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    public static void main(final String[] args) {
        final Engine v6 = Engine.V6;

        final List<Tyre> tyres = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            tyres.add(createTyre());
        }

        final Chassis chassis = Chassis.builder()
                .color(Color.BLACK)
                .modelType("Opel Astra H")
                .build();

        final Car car = Car.builder()
                .engine(v6)
                .wheels(tyres)
                .chassis(chassis)
                .build();

        log.info(car.toString());
        // if you reach this point you might be ultimately lazy
        // and use lombok's @Builder instead so
        // don't write manually Builders anymore
    }

    private static Tyre createTyre() {
        return Tyre.builder()
                .wheelRadius(WHEELRADIUS)
                .width(WIDTH)
                .height(HEIGHT)
                .build();
    }

}
