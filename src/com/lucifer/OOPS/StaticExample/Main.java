package com.lucifer.OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human mohit = new Human(19,"Mohit",10000,true);
//        Human rahul = new Human(20,"Rahul", 1000, false);
//        System.out.println(mohit.name);
//        System.out.println(rahul.name);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

//          greeting(); // you can't access in static
//          Main obj1 = new Main();
//          obj1.greeting();
    }
    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("hello World!");
    }
}
