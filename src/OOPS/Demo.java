package com.Lucifer.OOPS;

public class Demo {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentName="Lucifer";
        st1.studentId=123;
        st1.studentCity="New York";
        st1.study();
        System.out.println("--------------------");

        st1.showFullDetails();
        System.out.println("---------------------");

        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);
    }
}
