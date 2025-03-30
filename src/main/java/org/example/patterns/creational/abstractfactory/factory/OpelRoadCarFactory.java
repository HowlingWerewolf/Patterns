package org.example.patterns.creational.abstractfactory.factory;

import org.example.patterns.creational.abstractfactory.entity.Chassis;
import org.example.patterns.creational.abstractfactory.entity.Engine;
import org.example.patterns.creational.abstractfactory.entity.Tyre;
import org.example.patterns.creational.abstractfactory.entity.Windows;

import java.awt.*;

/**
 * Car designed to drive on public roads.
 */
public class OpelRoadCarFactory implements AbstractCarFactory {

    private static final int WHEELRADIUS = 15;
    private static final int HEIGHT = 60;
    private static final int WIDTH = 195;

    @Override
    public Tyre createTyre() {
        final Tyre tyre = new Tyre();
        tyre.setWheelRadius(WHEELRADIUS);
        tyre.setHeight(HEIGHT);
        tyre.setWidth(WIDTH);
        return tyre;
    }

    @Override
    public Chassis createChassis() {
        final Chassis chassis = new Chassis();
        chassis.setColor(Color.WHITE);
        chassis.setModelType("Opel");
        return chassis;
    }

    @Override
    public Engine createEngine() {
        return Engine.V6;
    }

    @Override
    public Windows createWindows() {
        final Windows windows = new Windows();
        windows.setShape("trapezoid");
        windows.setHeight(60);
        windows.setWidth(90);
        return windows;
    }

}
