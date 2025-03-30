package org.example.patterns.creational.factorymethod.entity.reloading;

import lombok.extern.java.Log;

@Log
public class ElectricStorage implements Reloadable {

    double charge = 0.0D;

    @Override
    public void reload() throws InterruptedException {
        log.info("Recharging electric storage...");
        Thread.sleep(3000);
        charge = 1.0D;
    }

}
