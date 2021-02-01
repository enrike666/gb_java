package com.company.Lesson7;

public interface Sportable {

    default boolean overcomeObstacle(Obstacle obstacle) {
        boolean result;
        if (obstacle instanceof Wall) {
            result = jump(obstacle.size);
        } else {
            result = run(obstacle.size);
        }

        return result;
    }

    boolean run(int distance);
    boolean jump(int height);
}
