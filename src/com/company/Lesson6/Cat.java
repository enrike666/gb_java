package com.company.Lesson6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        boolean success =  p.decreaseFood(appetite);
        if (success) {
            this.satiety = true;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety;
    }
}
