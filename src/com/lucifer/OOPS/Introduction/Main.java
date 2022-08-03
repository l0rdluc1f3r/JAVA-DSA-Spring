package com.lucifer.OOPS.Introduction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // storing the data of students
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
    }
    // creating the clASS
    // for every single student
    class Student {
        int rno;
        String name;
        float marks;
    }
}

































