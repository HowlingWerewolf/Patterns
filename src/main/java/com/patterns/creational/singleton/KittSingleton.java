package com.patterns.creational.singleton;

import com.patterns.creational.singleton.entity.Car;
import com.patterns.creational.singleton.entity.Chassis;

import java.awt.*;

public class KittSingleton extends Car {

    public static KittSingleton instance;

    private KittSingleton() {}

    public static KittSingleton getKitt() {
        if (instance == null) {
            instance = new KittSingleton();
            instance.setChassis(Chassis.builder()
                    .modelType("Pontiac")
                    .color(Color.BLACK).build());

            // some signal to check that this instance is created only once
            System.out.println("I'm alive!");
        }

        System.out.println("I'm coming, Michael!");
        return instance;
    }

}
