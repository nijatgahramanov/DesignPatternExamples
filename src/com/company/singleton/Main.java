package com.company.singleton;

public class Main {
    public static void main(String[] args) {

        SingleDao obj = new SingleDao();
        SingleDao obj1 = new SingleDao();

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

    }
}
