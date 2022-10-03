package com.lucifer.OOPS.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float  marks;

    Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // if diff == 0 then both are equal
        // if diff < 0; o are bigger else o are smaller

        return diff;
    }
}
