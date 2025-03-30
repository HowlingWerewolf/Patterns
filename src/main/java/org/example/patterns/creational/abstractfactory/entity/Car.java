package org.example.patterns.creational.abstractfactory.entity;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@ToString
public class Car {

    Engine engine;
    List<Tyre> tyres;
    Chassis chassis;
    Windows windows;

}
