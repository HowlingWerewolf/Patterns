package org.example.patterns.creational.prototype;

import lombok.extern.java.Log;
import org.example.patterns.creational.prototype.entity.Car;
import org.example.patterns.creational.prototype.entity.Factory;
import org.example.patterns.creational.prototype.entity.Karr;
import org.example.patterns.creational.prototype.entity.Kitt;

@Log
public class PrototypeDemo {

    public static void main(String[] args) {
        final Car kitt = Factory.getPrototype("Kitt");
        final Car karr = Factory.getPrototype("Karr");

        // a nonexistent prototype
        final Car michael = Factory.getPrototype("Michael");

        if (kitt instanceof Kitt) {
            log.info("Kitt: Hello Michael!");
        }

        if (karr instanceof Karr) {
            log.info("Karr: Grr... attempting to kill Kitt!");
        }

        if (michael == null) {
            log.info("Prototype error, \"Michael\" blueprint not found!");
        }
    }

}
