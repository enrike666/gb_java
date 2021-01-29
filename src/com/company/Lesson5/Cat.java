package com.company.Lesson5;

public class Cat extends Animal {

    private static final int RUN_LIMIT = 200;

    public Cat(String name, String type) {
        super(name, type, RUN_LIMIT);
    }

    @Override
    public void swim(int value) {
        System.out.println(name + ": я не умею плавать");
    }
}
