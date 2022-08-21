package com.lucifer.DataStructures;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(12);
        list.insertFirst(17);
        list.insertLast(22);
        list.insert(33,3);
        System.out.println(list.deleteFirst());
        list.display();
    }
}
