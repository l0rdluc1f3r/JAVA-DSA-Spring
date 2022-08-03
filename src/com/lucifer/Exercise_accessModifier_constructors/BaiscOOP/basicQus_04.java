// Create a class Square with a method to initialize its side, calculating area, perimeter etc.

package com.Lucifer.BaiscOOP;

class square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class basicQus_04 {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
