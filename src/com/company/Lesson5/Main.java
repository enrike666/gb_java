package com.company.Lesson5;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars", "type1");
        Cat cat2 = new Cat("Murzik", "type2");

        Dog dog1 = new Dog("Mark", "type1");
        Dog dog2 = new Dog("Pit", "type2");

        cat1.run(20);
        cat2.run(250);
        cat1.swim(10);

        dog1.run(300);
        dog2.swim(600);
    }
}
