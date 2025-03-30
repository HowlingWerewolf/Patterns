package org.example.patterns.creational.factorymethod.entity;

import org.example.patterns.creational.factorymethod.entity.reloading.PetrolTank;
import lombok.Getter;

@Getter
public class PetrolCar extends Car {

    @Override
    public void createReloadable() {
        reloadable = new PetrolTank();
    }

}
