package com.company.Lesson5;

public abstract class Animal {

    protected String name;
    protected String type;
    private int RUN_LIMIT;

    public Animal(String name, String type, int run_limit) {
        this.name = name;
        this.type = type;
        RUN_LIMIT = run_limit;
    }

    public void swim(int value) {
        System.out.println(name + "  проплыл " + value + " метров");
    }
    public void run(int value) {
        if (value <= RUN_LIMIT) {
            System.out.println(name + "  пробежал " + value + " метров");
        } else {
            System.out.println(name + ": я не умею так далеко бегать");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
