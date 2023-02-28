package com.patterns.creational.builder.withoutPattern;

import lombok.Setter;

import java.awt.*;

@Setter
public class Chassis {

    Color color;
    String modelType;

    @Override
    public String toString() {
        return "Chassis{" +
                "color=" + color +
                ", modelType='" + modelType + '\'' +
                '}';
    }

}
