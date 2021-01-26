package com.company.Lesson1;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short sh = 50;
        int i = 200;
        long l = 700L;

        float f = 1.57f;
        double d = 4.25;

        char ch = 'a';

        String str = "Class";

        /*тестирование задания 8
        int[] years = new int[371];
        int firstYears = 1762;

        for (int i = 0; i <= 370; i++ ){
            years[i] = firstYears;
            firstYears+=1;
        }

        for (int y: years) {
            boolean isLeap = IsLeapYear(y);
            if (isLeap){
                System.out.println(y);
            }
        }
        */
    }

    //задание 3
    public static float Function(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //задание 4
    public  static boolean SumIsIncludedRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        return false;
    }

    //задание 5
    public static void PrintPositiveOrNegativeNumber(int a) {
        if (a>= 0){
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    //задание 6
    public  static boolean IsNegativeNumber(int a) {
        if (a>= 0){
            return false;
        }
        return true;
    }

    //задание 7
    public static void Hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //задание 8
    public static boolean IsLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
