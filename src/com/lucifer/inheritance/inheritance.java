package com.Lucifer.inheritance;

class Base {
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting X now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base {
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        // creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of Derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}



















