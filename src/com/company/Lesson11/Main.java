package com.company.Lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayString = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        swapsElements(arrayString,1, 4);

        ArrayList<Apple> listApple1 = new ArrayList();
        listApple1.add(new Apple());
        listApple1.add(new Apple());
        listApple1.add(new Apple());

        ArrayList<Apple> listApple2 = new ArrayList();
        listApple2.add(new Apple());
        listApple2.add(new Apple());

        Box<Apple> boxApple1 = new Box(listApple1);
        Box<Apple> boxApple2 = new Box(listApple2);

        ArrayList<Orange> listOrange = new ArrayList();
        listOrange.add(new Orange());
        listOrange.add(new Orange());
        Box<Orange> boxOrange = new Box(listOrange);

        // проверка метода compare()
        boolean result = boxApple1.compare(boxOrange);

        // проверка метода transferFruit()
        System.out.println(boxApple1.getWeight());
        System.out.println(boxApple2.getWeight());

        boxApple1.transferFruit(boxApple2);

        System.out.println("\n" + boxApple1.getWeight());
        System.out.println(boxApple2.getWeight());
    }

    // задание 1
    // на вход передаем массив каких-то объектов и индексы элементов, которые хотим поменять местами
    public static <T> void swapsElements(T[] array, int a, int b){
        T temporary;
        temporary = array[b];
        array[b] = array[a];
        array[a] = temporary;
    }
}
