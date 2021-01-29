package com.company.Lesson7;

public class Human implements Sportable{

    public final int MaxDistance = 300;
    public final int MaxJumpHeight = 2;

    @Override
    public void overcomeObstacle(Obstacle obstacle) {

    }

    @Override
    public void run(int distance) {
        System.out.println("Человек пробежал" + distance + " м");
    }

    @Override
    public void jump(int height) {
        System.out.println("Человек прыгнул на " + height + " м");
    }
}
