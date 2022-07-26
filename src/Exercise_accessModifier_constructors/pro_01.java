package com.Lucifer.Exercise_accessModifier_constructors;

class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* 3.142* radius * radius + 2*3.142*radius*height;
    }
    public double volume(){
        return 3.142*radius*radius*height;
    }
}

public class pro_01 {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder();
        mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}




















