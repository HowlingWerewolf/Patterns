package org.example.patterns.creational.factorymethod.entity;

import org.example.patterns.creational.factorymethod.entity.reloading.ElectricStorage;
import lombok.Getter;

@Getter
public class ElectricCar extends Car {

    @Override
    public void createReloadable() {
        reloadable = new ElectricStorage();
    }

}
