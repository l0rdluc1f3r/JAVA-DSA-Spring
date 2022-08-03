// Create a class cellphone with methods to print “ringing…”, “vibrating…”,
// etc.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

package com.Lucifer.BaiscOOP;

class cellPhone {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling your friend...");
    }
}
public class basicQus_03 {
    public static void main(String[] args) {
        cellPhone iphone = new cellPhone();
        iphone.callFriend();
        iphone.vibrate();
        iphone.ring();
    }
}
