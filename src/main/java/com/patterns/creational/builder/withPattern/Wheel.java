package com.patterns.creational.builder.withPattern;

import lombok.Setter;

@Setter
public class Wheel {

    public int radius;
    public int width;
    public int height;

    public static WheelBuilder builder() {
        return new WheelBuilder();
    }

    public static class WheelBuilder {

        Wheel wheel;

        WheelBuilder() {
            wheel = new Wheel();
        }

        public WheelBuilder radius(int radius) {
            wheel.setRadius(radius);
            return this;
        }

        public WheelBuilder width(int width) {
            wheel.setWidth(width);
            return this;
        }

        public WheelBuilder height(int height) {
            wheel.setHeight(height);
            return this;
        }

        public Wheel build() {
            return wheel;
        }

    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}
