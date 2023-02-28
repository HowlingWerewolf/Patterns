package com.patterns.creational.builder.withPattern;

import lombok.Setter;

import java.util.List;

@Setter
public class Car {

    Engine engine;
    List<Wheel> wheels;
    Chassis chassis;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        Car car;

        CarBuilder() {
            car = new Car();
        }

        public CarBuilder engine(Engine engine) {
            car.setEngine(engine);
            return this;
        }

        public CarBuilder wheels(List<Wheel> wheels) {
            car.setWheels(wheels);
            return this;
        }

        public CarBuilder chassis(Chassis chassis) {
            car.setChassis(chassis);
            return this;
        }

        public Car build() {
            return car;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", chassis=" + chassis +
                '}';
    }

}
