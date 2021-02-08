package com.company.Lesson9;

import com.company.Lesson6.Plate;

public class Cat {
    public int ID;
    public String name;
    public String gender;
    public int weight;

    public Cat(String name, String gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public void print() {
        System.out.println("Cat" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight);
    }
}
