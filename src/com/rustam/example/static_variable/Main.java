package com.rustam.example.static_variable;

public class Main {
    public static void main(String[] args) {
        //String name = Animal.name;
        Dog name = new Dog("Cat");
        System.out.println(Animal.name);

    }
}
