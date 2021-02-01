package com.company.Lesson7;

public class Robot implements Sportable{

    public final int MaxDistance = 1000;
    public final int MaxJumpHeight = 5;

    @Override
    public boolean run(int distance) {
        if (distance <= MaxDistance) {
            System.out.println("Робот пробежал " + distance + " м");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + distance + " м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MaxJumpHeight) {
            System.out.println("Робот прыгнул на " + height + " м");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть " + height + " м");
            return false;
        }
    }
}
