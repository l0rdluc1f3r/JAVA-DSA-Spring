
//Create a class Employee with the following properties and methods:
//
//        Salary (property) (int)
//        getSalary (method returning int)
//        name (property) (String)
//        getName (method returning String)
//        setName (method changing name)


package com.Lucifer.BaiscOOP;

class Employee1 {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class basicQus_02{
    public static void main(String[] args) {
        Employee1 lucifer = new Employee1();
        lucifer.setName("Lord Lucifer");
        lucifer.salary = 22;
        System.out.println(lucifer.getSalary());
        System.out.println(lucifer.getName());
    }
}














