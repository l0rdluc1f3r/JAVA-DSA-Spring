package com.Lucifer.OOPS;

public class Parent {
//    overridden method
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}
class Child extends Parent {
    // overriding method
    public void m1(){
        System.out.println("I am m1() of child");
    }
}
