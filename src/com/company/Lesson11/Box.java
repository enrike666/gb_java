package com.company.Lesson11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        if (fruits.size() != 0 ) {
            return fruits.size() * fruits.get(0).getFruitWight();
        } else {
            return 0;
        }
    }

    public boolean compare(Box<?> boxSecond) {
        if (this.getWeight() == boxSecond.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void transferFruit(Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }
}
