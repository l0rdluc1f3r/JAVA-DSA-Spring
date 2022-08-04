package com.lucifer.OOPS.Introduction;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // storing the data of students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

        Student rahul = new Student();
//        rahul.rno = 22;
//        rahul.name = "rahul bhai";
//        rahul.marks = 45.5f;
        rahul.greeting();
//        System.out.println(rahul.rno);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);
    }
    // creating the clASS
    // for every single student
    static class Student {
        int rno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello! my name is " + name);
        }
        Student(){
            this.rno = 22;
            this.name = "Rahul bhai";
            this.marks = 45.23f;
        }
    }
}

































