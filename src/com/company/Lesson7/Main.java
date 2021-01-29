package com.company.Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(2);
        cat.jump(1);

        Obstacle wall = new Wall(10);
        Obstacle treadmill = new Treadmill(20);
    }
}
