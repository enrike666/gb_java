package com.company.Lesson5;

public class Dog extends Animal {

    private static final int SWIM_LIMIT = 10;
    private static final int RUN_LIMIT = 500;

    public Dog(String name, String type) {
        super(name, type, RUN_LIMIT);
    }

    @Override
    public void swim(int value) {
        if (value <= SWIM_LIMIT ){
            super.swim(value);
        }else {
            System.out.println(name + ": я не умею так далеко плавать");
        }
    }

    @Override
    public void run(int value) {
        if (value <= RUN_LIMIT ){
            super.run(value);
        }else {
            System.out.println(name + ": я не умею так далеко бегать");
        }
    }
}
