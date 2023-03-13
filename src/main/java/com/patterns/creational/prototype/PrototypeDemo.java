package com.patterns.creational.prototype;

import com.patterns.creational.prototype.entity.Car;
import com.patterns.creational.prototype.entity.Factory;
import com.patterns.creational.prototype.entity.Karr;
import com.patterns.creational.prototype.entity.Kitt;

public class PrototypeDemo {

    public static void main(String[] args) {
        Car kitt = Factory.getPrototype("Kitt");
        Car karr = Factory.getPrototype("Karr");
        Car michael = Factory.getPrototype("Michael");

        if (kitt instanceof Kitt) {
            System.out.println("Kitt: Hello Michael!");
        }

        if (karr instanceof Karr) {
            System.out.println("Karr: Grr... attempting to kill Kitt!");
        }

        if (michael == null) {
            System.out.println("Prototype error, \"Michael\" blueprint not found!");
        }
    }

}
