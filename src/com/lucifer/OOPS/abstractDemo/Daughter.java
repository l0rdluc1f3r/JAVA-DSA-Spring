package com.lucifer.OOPS.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be terrist");
    }

    @Override
    void partner() {
        System.out.println("i love iron man");
    }
}
