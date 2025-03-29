package org.example.patterns.creational.builder.withpattern;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Tyre {

    int wheelRadius;
    int width;
    int height;

    public static TyreBuilder builder() {
        return new TyreBuilder();
    }

    public static class TyreBuilder {

        Tyre tyre;

        TyreBuilder() {
            tyre = new Tyre();
        }

        public TyreBuilder wheelRadius(final int wheelRadius) {
            tyre.setWheelRadius(wheelRadius);
            return this;
        }

        public TyreBuilder width(final int width) {
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
