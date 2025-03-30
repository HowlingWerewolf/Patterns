package org.example.patterns.creational.builder.withoutpattern;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Tyre {

    int wheelRadius;
    int width;
    int height;

    // I'm just lazy
    @Override
    public Tyre clone() {
        Tyre copyOfTyre = new Tyre();
        copyOfTyre.setWheelRadius(this.wheelRadius);
        copyOfTyre.setWidth(this.width);
        copyOfTyre.setHeight(this.height);
        return copyOfTyre;
    }

}
