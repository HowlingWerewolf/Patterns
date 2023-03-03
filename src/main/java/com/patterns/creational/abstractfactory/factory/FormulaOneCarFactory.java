package com.patterns.creational.abstractfactory.factory;

import com.patterns.creational.abstractfactory.entity.Chassis;
import com.patterns.creational.abstractfactory.entity.Engine;
import com.patterns.creational.abstractfactory.entity.Tyre;
import com.patterns.creational.abstractfactory.entity.Windows;

import java.awt.*;

/**
 * Car designed to drive on racetracks.
 */
public class FormulaOneCarFactory implements AbstractCarFactory {

    private static final int WHEELRADIUS = 46;
    private static final int HEIGHT = 70;
    private static final int WIDTH = 30;

    @Override
    public Tyre createTyre() {
        Tyre tyre = new Tyre();
        tyre.setWheelRadius(WHEELRADIUS);
        tyre.setHeight(HEIGHT);
        tyre.setWidth(WIDTH);
        return tyre;
    }

    @Override
    public Chassis createChassis() {
        Chassis chassis = new Chassis();
        chassis.setColor(Color.RED);
        chassis.setModelType("Ferrari");
        return chassis;
    }

    @Override
    public Engine createEngine() {
        return Engine.V6_TURBO;
    }

    @Override
    public Windows createWindows() {
        return null;
    }

}
