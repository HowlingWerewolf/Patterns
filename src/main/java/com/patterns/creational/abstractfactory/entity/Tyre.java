package com.patterns.creational.abstractfactory.entity;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Tyre {

    public int wheelRadius;
    public int width;
    public int height;

    // I'm just lazy
    Tyre copy() {
        Tyre copyOfTyre = new Tyre();
        copyOfTyre.setWheelRadius(this.wheelRadius);
        copyOfTyre.setWidth(this.width);
        copyOfTyre.setHeight(this.height);
        return copyOfTyre;
    }

}
