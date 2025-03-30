package com.patterns.creational.factorymethod.entity.reloading;

public class ElectricStorage implements Reloadable {

    public double charge = 0.0D;

    @Override
    public void reload() throws InterruptedException {
        System.out.println("Recharging electric storage...");
        Thread.sleep(3000);
        charge = 1.0D;
    }

}
