package org.example.patterns.creational.builder.withpattern;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@ToString
public class Car {

    Engine engine;
    List<Tyre> tyres;
    Chassis chassis;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        Car car;

        CarBuilder() {
            car = new Car();
        }

        public CarBuilder engine(final Engine engine) {
            car.setEngine(engine);
            return this;
        }

        public CarBuilder wheels(final List<Tyre> tyres) {
            car.setTyres(tyres);
            return this;
        }

        public CarBuilder chassis(final Chassis chassis) {
            car.setChassis(chassis);
            return this;
        }

        public Car build() {
            return car;
        }

    }

}
