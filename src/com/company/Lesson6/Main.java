package com.company.Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Barsik", 5),
                new Cat("Losik", 10),
                new Cat("Rubik", 15),
                new Cat("Orange", 20),
                new Cat("Mars", 10),
                new Cat("Volik", 5),
            };

        Plate plate = new Plate(55);

        System.out.println("\nДо: ");
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nПосле: ");
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        plate.info();

        System.out.println("\nДобавили еды в тарелку");
        plate.addFood(5);

        plate.info();
    }
}
