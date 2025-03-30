package org.example.patterns.creational.factorymethod;

import lombok.extern.java.Log;
import org.example.patterns.creational.factorymethod.entity.Car;
import org.example.patterns.creational.factorymethod.entity.ElectricCar;
import org.example.patterns.creational.factorymethod.entity.PetrolCar;

@Log
public class FactoryMethodDemo {

    public static void main(final String[] args) throws InterruptedException {
        final Car electricCar = new ElectricCar();
        electricCar.createReloadable();
        electricCar.getReloadable().reload();
        log.info(electricCar.toString());

        log.info("---------------------");

        final Car petrolCar = new PetrolCar();
        petrolCar.createReloadable();
        petrolCar.getReloadable().reload();
        log.info(petrolCar.toString());
    }

}
