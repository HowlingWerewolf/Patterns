package com.patterns.creational.factorymethod.entity.reloading;

public class PetrolTank implements Reloadable {

    public double fuelLevel = 0.0D;

    @Override
    public void reload() throws InterruptedException {
        System.out.println("Refuelling the tank...");
        Thread.sleep(3000);
        fuelLevel = 52.00D;
    }

}
