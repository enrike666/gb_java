package com.company.Lesson7;

public class Cat implements Sportable{

    public final int MaxDistance = 200;
    public final int MaxJumpHeight = 1;

    @Override
    public boolean run(int distance) {
        if (distance <= MaxDistance) {
            System.out.println("Кот пробежал " + distance + " м");
            return true;
        } else {
            System.out.println("Кот не смог пробежать " + distance + " м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MaxJumpHeight) {
            System.out.println("Кот прыгнул на " + height + " м");
            return true;
        } else {
            System.out.println("Кот не смог прыгнуть " + height + " м");
            return false;
        }
    }
}
