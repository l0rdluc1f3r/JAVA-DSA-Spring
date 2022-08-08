package com.lucifer.OOPS.Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }
    // method overloading
    int sum(int a, int b, int c){
        return a + b;
    }
    // static polymorphism
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(2,3,4);
//        obj.sum(2,3,4,5)
    }
}
