package com.lucifer.OOPS.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45; // this actually an wrapper class
        // becoz when we do a. its not gives many functionalities, but in the ccase of wrapper class
        // its gives you many functionalities
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
