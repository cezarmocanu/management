package com.home.managementbackend.entities;

public class EntityModel {
    
    //member declaration
    public int numberProperty;
    public String textProperty;

    //constructors

    //Default Empty constructor
    public EntityModel() {
        numberProperty = 25;
        textProperty = "Hello world";
    }

    //Construtor with parameters
    public EntityModel(int number, String text) {
        numberProperty = number;
        textProperty = text;
    }
}
