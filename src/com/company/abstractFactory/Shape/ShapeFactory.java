package com.company.abstractFactory.Shape;

import com.company.abstractFactory.AbstractFactory;
import com.company.abstractFactory.Colour.Colour;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if ((shapeType.equalsIgnoreCase("Circle"))) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }


    @Override
    public Colour getColour(String colour) {
        return null;
    }
}
