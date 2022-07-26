package com.Lucifer.inheritance;

class One {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class Two extends One {
    public void night(){
        System.out.println("Good Night");
    }
    public void name(){
        System.out.println("My name is Java in class Two");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        One obj = new One();
//        obj.name();
        One obj = new Two(); // thats call dynamic dispatching
    }
}

















