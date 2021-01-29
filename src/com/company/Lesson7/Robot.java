package com.company.Lesson7;

public class Robot implements Sportable{

    public final int MaxDistance = 1000;
    public final int MaxJumpHeight = 5;

    @Override
    public void overcomeObstacle(Obstacle obstacle) {

    }

    @Override
    public void run(int distance) {
        System.out.println("Робот пробежал" + distance + " м");
    }

    @Override
    public void jump(int height) {
        System.out.println("Робот прыгнул на " + height + " м");
    }
}
