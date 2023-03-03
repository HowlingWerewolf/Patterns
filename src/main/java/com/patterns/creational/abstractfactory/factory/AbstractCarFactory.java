package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.entity.Chassis;
import com.patterns.creational.abstractfactory.entity.Engine;
import com.patterns.creational.abstractfactory.entity.Tyre;
import com.patterns.creational.abstractfactory.entity.Windows;

public interface AbstractCarFactory {

    abstract Tyre createTyre();
    abstract Chassis createChassis();
    abstract Engine createEngine();
    abstract Windows createWindows();

}
