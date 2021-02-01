package com.company.Lesson7;

public class Main {
    public static void main(String[] args) {

        Sportable[] players = new Sportable[]{new Cat(), new Human(), new Robot()};

        Obstacle[] obstacles = new Obstacle[]{
                new Wall(1),
                new Treadmill(100),
                new Wall(2),
                new Treadmill(250),
                new Wall(3),
                new Treadmill(1500),
                new Wall(2)
            };

        for (Sportable player : players) {
            for (Obstacle obstacle : obstacles) {
                boolean result = player.overcomeObstacle(obstacle);
                if (!result) {
                    break;
                }
            }
        }
    }
}
