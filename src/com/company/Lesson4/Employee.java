package com.company.Lesson4;

public class Employee {
    public String fio;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printToConsole() {
        System.out.println("fio: " + this.fio);
        System.out.println("position: " + this.position);
        System.out.println("email: " + this.email);
        System.out.println("phone: " + this.phone);
        System.out.println("salary: " + this.salary);
        System.out.println("age: " + this.age + "\n");
    }
}
