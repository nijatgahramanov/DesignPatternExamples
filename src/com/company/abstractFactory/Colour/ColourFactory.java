package com.company.abstractFactory.Colour;

import com.company.abstractFactory.AbstractFactory;
import com.company.abstractFactory.Shape.Shape;

public class ColourFactory extends AbstractFactory {

    @Override
    public Colour getColour(String colour) {
        if (colour == null) {
            return null;
        } else if (colour.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colour.equalsIgnoreCase("Black")) {
            return new Black();
        } else if (colour.equalsIgnoreCase("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
