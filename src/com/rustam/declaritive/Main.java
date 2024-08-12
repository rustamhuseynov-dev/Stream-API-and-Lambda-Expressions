package com.rustam.declaritive;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Aş",20.0,100,true,true);
        Food food2 = new Food("Doner",2.50,20,true,true);
        Food food3 = new Food("Spagetti",12.0,100,true,true);
        Food food4 = new Food("Salat",2.0,150,false,false);
        Food food5 = new Food("kartoska",5.0,150,true,false);

        List<Food> foods = Arrays.asList(food, food2, food3, food4, food5);

        foods.stream()
                .sorted((f1, f2) -> Integer.compare(f2.getCalories(), f1.getCalories()))
                .forEach(System.out::println);
        foods.stream()
                .sorted((f1, f2) -> Integer.compare((int) f2.getPrice(), (int) f1.getPrice()))
                .forEach(System.out::println);
        foods.stream()
                .filter(f -> f.isFatty() || f.isMeat())
                .forEach(System.out::println);
        foods.stream()
                .filter(f -> f.getCalories() < 100)
                .forEach(System.out::println);

    }
}
