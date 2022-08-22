package com.lucifer.DataStructures;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // for single linked list
//        LL list = new LL();
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertFirst(12);
//        list.insertFirst(17);
//        list.insertLast(22);
//        list.insert(33,3);
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(3));
//        list.display();

        DLL list = new DLL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(12);
        list.insertFirst(17);

        list.display();
    }
}
