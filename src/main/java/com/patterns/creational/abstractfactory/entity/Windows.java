package com.patterns.creational.abstractfactory.entity;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Windows {

    public String shape;
    public int width;
    public int height;

    // I'm just lazy
    Windows copy() {
        Windows copyOfTyre = new Windows();
        copyOfTyre.setShape(this.shape);
        copyOfTyre.setWidth(this.width);
        copyOfTyre.setHeight(this.height);
        return copyOfTyre;
    }

}
