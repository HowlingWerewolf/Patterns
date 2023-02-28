package com.patterns.creational.builder.withPattern;

import lombok.Setter;

import java.awt.*;

@Setter
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

        public ChassisBuilder color(Color color) {
            chassis.setColor(color);
            return this;
        }

        public ChassisBuilder modelType(String modelType) {
            chassis.setModelType(modelType);
            return this;
        }

        public Chassis build() {
            return chassis;
        }

    }

    @Override
    public String toString() {
        return "Chassis{" +
                "color=" + color +
                ", modelType='" + modelType + '\'' +
                '}';
    }

}
