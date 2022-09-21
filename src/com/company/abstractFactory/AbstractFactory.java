package com.company.abstractFactory;

import com.company.abstractFactory.Colour.Colour;
import com.company.abstractFactory.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);

    public abstract Colour getColour(String colour);
}
