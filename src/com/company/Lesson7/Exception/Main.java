package com.company.Lesson7.Exception;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1","2","3","4"},
                {"5","6","9","0"},
                {"2","4","6","1"},
                {"3","2","5","0"}
            };

        try {
            int sum = SetArray(array);
            System.out.println("Сумма чисел в массиве: " + sum);
        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static int SetArray(String[][] array) throws Exception{
        if (array.length != 4) {
            throw new MyArraySizeException("Неверное кол-во строк");
        }
        for (String[] string : array) {
            if (string.length != 4) {
                throw new MyArraySizeException("Неверное кол-во символов в строке");
            }
        }

        int sum = 0;
        Integer x = 0;
        Integer y = 0;

        try {
            for (int i = 0; i< array.length; i++) {
                for (int j = 0; j< array[i].length; j++){
                    x = i;
                    y = j;
                    sum = sum +  Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
           throw new MyArrayDataException("Некорректный символ в ячейке: " + (x+1) + ", " + (y+1));
        }

        return sum;
    }
}
