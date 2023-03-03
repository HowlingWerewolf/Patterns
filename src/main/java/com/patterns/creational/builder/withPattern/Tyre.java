package com.patterns.creational.builder.withPattern;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Tyre {

    public int wheelRadius;
    public int width;
    public int height;

    public static TyreBuilder builder() {
        return new TyreBuilder();
    }

    public static class TyreBuilder {

        Tyre tyre;

        TyreBuilder() {
            tyre = new Tyre();
        }

        public TyreBuilder wheelRadius(int wheelRadius) {
            tyre.setWheelRadius(wheelRadius);
            return this;
        }

        public TyreBuilder width(int width) {
            tyre.setWidth(width);
            return this;
        }

        public TyreBuilder height(int height) {
            tyre.setHeight(height);
            return this;
        }

        public Tyre build() {
            return tyre;
        }

    }

}
