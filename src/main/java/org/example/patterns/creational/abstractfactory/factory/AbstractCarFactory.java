package org.example.patterns.creational.abstractfactory.factory;

import org.example.patterns.creational.abstractfactory.entity.Chassis;
import org.example.patterns.creational.abstractfactory.entity.Engine;
import org.example.patterns.creational.abstractfactory.entity.Tyre;
import org.example.patterns.creational.abstractfactory.entity.Windows;

public interface AbstractCarFactory {

    Tyre createTyre();
    Chassis createChassis();
    Engine createEngine();
    Windows createWindows();

}
