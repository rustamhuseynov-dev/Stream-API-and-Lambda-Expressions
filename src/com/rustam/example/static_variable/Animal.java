package com.rustam.example.static_variable;

public class Animal {

    public static String name;

    public Animal(String name) {
        Animal.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
