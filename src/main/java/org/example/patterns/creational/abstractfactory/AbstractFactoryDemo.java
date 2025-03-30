package org.example.patterns.creational.abstractfactory;

import lombok.extern.java.Log;
import org.example.patterns.creational.abstractfactory.entity.Car;
import org.example.patterns.creational.abstractfactory.factory.FactoryClient;
import org.example.patterns.creational.abstractfactory.factory.FormulaOneCarFactory;
import org.example.patterns.creational.abstractfactory.factory.OpelRoadCarFactory;

@Log
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        final FactoryClient formulaOneCarFactoryClient = new FactoryClient(new FormulaOneCarFactory());
        final Car formulaOneCar = formulaOneCarFactoryClient.getCar();
        log.info(formulaOneCar.toString());

        final FactoryClient opelRoadCarFactoryClient = new FactoryClient(new OpelRoadCarFactory());
        final Car roadCar = opelRoadCarFactoryClient.getCar();
        log.info(roadCar.toString());
    }
    
}
