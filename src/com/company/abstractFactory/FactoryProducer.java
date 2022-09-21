package com.company.abstractFactory;

import com.company.abstractFactory.Colour.ColourFactory;
import com.company.abstractFactory.Shape.Shape;
import com.company.abstractFactory.Shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("Colour")){
            return new ColourFactory();
        }
        return null;
    }
}
