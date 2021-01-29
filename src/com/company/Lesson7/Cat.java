package com.company.Lesson7;

public class Cat implements Sportable{

    public final int MaxDistance = 200;
    public final int MaxJumpHeight = 1;

    @Override
    public void overcomeObstacle(Obstacle obstacle) {

    }

    @Override
    public void run(int distance) {
        System.out.println("Кот пробежал" + distance + " м");
    }

    @Override
    public void jump(int height) {
        System.out.println("Кот прыгнул на " + height + " м");
    }
}
