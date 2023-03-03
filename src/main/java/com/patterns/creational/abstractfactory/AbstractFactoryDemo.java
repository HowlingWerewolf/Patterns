package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.entity.Car;
import com.patterns.creational.abstractfactory.factory.FactoryClient;
import com.patterns.creational.abstractfactory.factory.FormulaOneCarFactory;
import com.patterns.creational.abstractfactory.factory.OpelRoadCarFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        FactoryClient formulaOneCarFactoryClient = new FactoryClient(new FormulaOneCarFactory());
        Car formulaOneCar = formulaOneCarFactoryClient.getCar();
        System.out.println(formulaOneCar);

        FactoryClient opelRoadCarFactoryClient = new FactoryClient(new OpelRoadCarFactory());
        Car roadCar = opelRoadCarFactoryClient.getCar();
        System.out.println(roadCar);
    }
    
}
