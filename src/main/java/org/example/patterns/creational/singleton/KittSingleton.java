package org.example.patterns.creational.singleton;

import lombok.extern.java.Log;
import org.example.patterns.creational.singleton.entity.Car;
import org.example.patterns.creational.singleton.entity.Chassis;

import java.awt.*;

@Log
public class KittSingleton extends Car {

    static KittSingleton instance;

    private KittSingleton() {}

    public static KittSingleton getKitt() {
        if (instance == null) {
            instance = new KittSingleton();
            instance.setChassis(Chassis.builder()
                    .modelType("Pontiac")
                    .color(Color.BLACK).build());

            // some signal to check that this instance is created only once
            log.info("I'm alive!");
        }

        log.info("I'm coming, Michael!");
        return instance;
    }

}
