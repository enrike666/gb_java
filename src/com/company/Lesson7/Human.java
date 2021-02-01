package com.company.Lesson7;

public class Human implements Sportable{

    public final int MaxDistance = 300;
    public final int MaxJumpHeight = 2;

    @Override
    public boolean run(int distance) {
        if (distance <= MaxDistance) {
            System.out.println("Человек пробежал " + distance + " м");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + distance + " м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MaxJumpHeight) {
            System.out.println("Человек прыгнул на " + height + " м");
            return true;
        } else {
            System.out.println("Человек не смог прыгнуть " + height + " м");
            return false;
        }
    }
}
