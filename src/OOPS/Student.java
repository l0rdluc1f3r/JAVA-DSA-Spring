package com.Lucifer.OOPS;

public class Student {
        int studentId;
        String studentName;
        String studentCity;

        public void Student(){
            System.out.println("Creating object");
        }


        public void study(){
            System.out.println(studentName + " is studying");
        }
        public void showFullDetails(){
            System.out.println("My name is " + studentName);
            System.out.println("My id is " + studentId);
            System.out.println("My city is " + studentCity);
        }
    }

