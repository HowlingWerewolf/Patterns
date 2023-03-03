package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.entity.Car;
import lombok.Getter;

import java.util.List;

@Getter
public class FactoryClient {

    Car car = new Car();

    public FactoryClient(AbstractCarFactory factory) {
        car.setTyres(List.of(factory.createTyre(), factory.createTyre(), factory.createTyre(), factory.createTyre()));
        car.setEngine(factory.createEngine());
        car.setChassis(factory.createChassis());
        car.setWindows(factory.createWindows());
    }
}
