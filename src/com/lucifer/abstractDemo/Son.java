package com.lucifer.abstractDemo;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be good man");
    }
    @Override
    void partner() {
        System.out.println("I love wonder women");
    }
}
