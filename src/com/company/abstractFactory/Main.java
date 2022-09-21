package com.company.abstractFactory;

import com.company.abstractFactory.Colour.Colour;
import com.company.abstractFactory.Shape.Shape;

public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw(); //Circle was drawed

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw(); //Rectangle was drawed

        AbstractFactory colourFactory = FactoryProducer.getFactory("Colour");
        Colour color1 = colourFactory.getColour("Red");
        color1.fill(); //Inside Red : method fill

        Colour colour2 = colourFactory.getColour("Black");
        colour2.fill();// Inside Black : method fill

    }
}
