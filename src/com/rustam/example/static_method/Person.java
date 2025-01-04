package com.rustam.example.static_method;

public class Person {

    public static String name(String name){
        if (name.length() < 6){
            return name;
        }else {
            return "dogru daxil edin";
        }
    }
}
