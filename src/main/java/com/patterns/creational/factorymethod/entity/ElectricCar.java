package com.patterns.creational.factorymethod.entity;

import com.patterns.creational.factorymethod.entity.reloading.ElectricStorage;
import lombok.Getter;

@Getter
public class ElectricCar extends Car {

    @Override
    public void createReloadable() {
        reloadable = new ElectricStorage();
    }

}
