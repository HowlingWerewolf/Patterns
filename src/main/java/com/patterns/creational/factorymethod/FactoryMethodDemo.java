package com.patterns.creational.factorymethod;

import com.patterns.creational.factorymethod.entity.Car;
import com.patterns.creational.factorymethod.entity.ElectricCar;
import com.patterns.creational.factorymethod.entity.PetrolCar;

public class FactoryMethodDemo {

    public static void main(String[] args) throws InterruptedException {
        Car electricCar = new ElectricCar();
        electricCar.createReloadable();
        electricCar.getReloadable().reload();
        System.out.println(electricCar);

        System.out.println("---------------------");

        Car petrolCar = new PetrolCar();
        petrolCar.createReloadable();
        petrolCar.getReloadable().reload();
        System.out.println(petrolCar);
    }

}
