package org.example.patterns.creational.factorymethod.entity;

import org.example.patterns.creational.factorymethod.entity.reloading.Reloadable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Car {

    // let's narrow down the example to the reloadable unit, not listing other parts
    Reloadable reloadable;

    public abstract void createReloadable();

}
