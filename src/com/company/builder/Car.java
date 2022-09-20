package com.company.builder;

public class Car {

    private String name; //required
    private String model; //required

    private String color; //optional
    private String status; //optional


    public static class Builder {
        private String name; //required
        private String model; //required

        private String color; //optional
        private String status; //optional

        public Builder(String name, String model) {
            this.name = name;
            this.model = model;
        }

        public Builder addColor(String color) {
            this.color = color;
            return this;
        }

        public Builder addStatus(String status) {
            this.status = status;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public Car(Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.color = builder.color;
        this.status = builder.status;
    }

}
