package com.Lucifer.BaiscOOP;

class Employee {
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
        System.out.println("My salary is "+ salary);
    }
}
public class customClass_01 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee lucifer = new Employee();
        Employee john = new Employee();
        // setting attributes (properties)
        lucifer.id = 7;
        lucifer.name = "Lord Lucifer";
        lucifer.salary = 1000000;

        john.id = 10;
        john.name = "John Snowden";
        john.salary = 100000;
        lucifer.printDetails();
        System.out.println();
        john.printDetails();
//        System.out.println(lucifer.id);
//        System.out.println(lucifer.name);
    }
}
