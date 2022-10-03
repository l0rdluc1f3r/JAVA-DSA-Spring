package com.lucifer.OOPS.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student mohit = new Student(2,66.47f);
        Student ravi = new Student(5,68.9f);
        Student naman = new Student(13, 66.77f);
        Student sachin = new Student(9,45.66f);
        Student virat = new Student(15,73.44f);

        Student[] list = {mohit, ravi, naman, sachin, virat};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(mohit.compareTo(ravi) < 0){
//            System.out.println(mohit.compareTo(ravi));
//            System.out.println("ravi having more marks");
//        }
    }
}
