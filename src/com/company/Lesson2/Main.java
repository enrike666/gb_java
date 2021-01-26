package com.company.Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //задание 1
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i =0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        //задание 2
        int[] array2 = new int[8];

        int value = 0;
        for (int i =0; i < array2.length; i++) {
            array2[i] = value;
            value += 3;
        }

        //задание 3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i =0; i < array.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }

        //задание 4
        int[][] array4 = new int[6][6];
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
        }

        int j = array4.length - 1;
        for (int i = 0; i < array4.length; i++) {
            array4[i][j] = 1;
            j -= 1;
        }

        //задание 5
        int[] array5 = {0,3,6,4,7,8,2,1};
        int max = array5[0];
        int min = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
            } else if (array5[i] < min) {
                min = array5[i];
            }
        }

        int[] arrayTest = {4,0,3,2};
//        boolean result = checkBalance(arrayTest);
//        System.out.println(result);

        int[] result = shift(arrayTest, 1);
        for (int i : result){
            System.out.println(i);
        }
    }

    //задание 6
    public static boolean checkBalance(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int[] array1 = Arrays.copyOfRange(array, 0, i);
            int[] array2 = Arrays.copyOfRange(array, i, array.length);

            if (sumArray(array1) == sumArray(array2)) {
                System.out.println("на границе: " + i);
                return true;
            }
        }
        return false;
    }

    public static int sumArray(int[] array){
        int sum = 0;
        for (int a: array) {
            sum = sum + a;
        }
        return sum;
    }

    //задание 7
    public static int[] shift(int[] array, int n) {
        //int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i-n >= 0){
                array[i] = array[i-n];
            } else {
                array[i] = array[array.length-n-i];
            }
        }
        return array;
    }
}
