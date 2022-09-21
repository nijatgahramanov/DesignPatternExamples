package com.company.factory;

public class Main {
    public static void main(String[] args) {


        ShapeFactory shape1 = new ShapeFactory();
        shape1.getShape("Circle").draw();

        ShapeFactory shape2 = new ShapeFactory();
        shape2.getShape("Rectangle").draw();

        ShapeFactory shape3 = new ShapeFactory();
        shape3.getShape(null).draw();


    }
}
