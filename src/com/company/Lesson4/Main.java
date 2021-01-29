package com.company.Lesson4;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петя", "инженер", "pt@mail.com","8956", 41000, 30);
        Employee employee2 = new Employee("Ваня", "программист", "ii@mail.com","4521", 20000, 28);
        Employee employee3 = new Employee("Максим", "админ", "mr@mail.com","8965", 18000, 41);
        Employee employee4 = new Employee("Сергей", "директор", "sa@mail.com","6325", 30000, 20);
        Employee employee5 = new Employee("Юра", "уборщик", "yk@mail.com","8947", 28000, 50);

        Employee[] emplArray = new Employee[]{employee1, employee2, employee3, employee4, employee5};
        for (Employee empl: emplArray) {
            if (empl.age > 40) {
                empl.printToConsole();
            }
        }
    }
}