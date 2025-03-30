package org.example.patterns.creational.singleton.entity;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;

@Setter
@Builder
@ToString
public class Chassis {

    Color color;
    String modelType;

}
