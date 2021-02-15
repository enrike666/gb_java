package com.company.Lesson11;

public abstract class Fruit {
    private final float WEIGHT;

    public Fruit(float WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public float getFruitWight() {
        return WEIGHT;
    }
}
