package com.patterns.creational.builder.withoutPattern;

import lombok.Setter;

@Setter
public class Wheel {

    public int radius;
    public int width;
    public int height;

    // I'm just lazy
    Wheel copy() {
        Wheel copyOfWheel = new Wheel();
        copyOfWheel.setRadius(this.radius);
        copyOfWheel.setWidth(this.width);
        copyOfWheel.setHeight(this.height);
        return copyOfWheel;
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
