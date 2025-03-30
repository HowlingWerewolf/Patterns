package org.example.patterns.creational.builder.withoutpattern;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@ToString
public class Car {

    Engine engine;
    List<Tyre> tyres;
    Chassis chassis;

}
