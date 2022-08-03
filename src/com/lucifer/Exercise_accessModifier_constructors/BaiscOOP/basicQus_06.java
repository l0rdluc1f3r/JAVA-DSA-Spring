// Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc

package com.Lucifer.BaiscOOP;

class tommy {
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void run(){
        System.out.println("Running from the enemy...");
    }
    public void fire(){
        System.out.println("Firing on the enemy...");
    }
}
public class basicQus_06 {
    public static void main(String[] args) {
        tommy ty = new tommy();
        ty.hit();
        ty.run();
        ty.fire();
    }
}
