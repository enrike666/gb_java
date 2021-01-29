package com.company.Lesson6;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food){
            food -= n;
            return true;
        } else {
            System.out.println("Еды в тарелке не хватило!");
            return false;
        }
    }

    public void addFood(int value) {
        food += value;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
