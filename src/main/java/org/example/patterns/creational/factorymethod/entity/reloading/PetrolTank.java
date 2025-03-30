package org.example.patterns.creational.factorymethod.entity.reloading;

import lombok.extern.java.Log;

@Log
public class PetrolTank implements Reloadable {

    double fuelLevel = 0.0D;

    @Override
    public void reload() throws InterruptedException {
        log.info("Refuelling the tank...");
        Thread.sleep(3000);
        fuelLevel = 52.00D;
    }

}
