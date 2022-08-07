package com.lucifer.OOPS.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean studentOrNot;
    static long population;

    public Human(int age,String name, int salary,boolean studentOrNot){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.studentOrNot = studentOrNot;
        Human.population += 1;
    }
}
