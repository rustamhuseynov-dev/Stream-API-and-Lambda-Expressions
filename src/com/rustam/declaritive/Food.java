package com.rustam.declaritive;

import java.util.Objects;

public class Food {
    private String name;
    private double price;
    private int calories;
    private boolean isFatty;
    private boolean isMeat;

    public Food(String name, double price, int calories, boolean isFatty, boolean isMeat) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.isFatty = isFatty;
        this.isMeat = isMeat;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isFatty() {
        return isFatty;
    }

    public boolean isMeat() {
        return isMeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(price, food.price) == 0 && calories == food.calories && isFatty == food.isFatty && isMeat == food.isMeat && Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, calories, isFatty, isMeat);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", isFatty=" + isFatty +
                ", isMeat=" + isMeat +
                '}';
    }
}
