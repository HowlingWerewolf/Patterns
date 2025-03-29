package org.example.patterns.creational.builder.withpattern;

import lombok.Setter;
import lombok.ToString;

import java.awt.*;

@Setter
@ToString
public class Chassis {

    Color color;
    String modelType;

    public static ChassisBuilder builder() {
        return new ChassisBuilder();
    }

    public static class ChassisBuilder {

        Chassis chassis;

        ChassisBuilder() {
            chassis = new Chassis();
        }

        public ChassisBuilder color(final Color color) {
            chassis.setColor(color);
            return this;
        }

        public ChassisBuilder modelType(final String modelType) {
            chassis.setModelType(modelType);
            return this;
        }

        public Chassis build() {
            return chassis;
        }

    }

}
