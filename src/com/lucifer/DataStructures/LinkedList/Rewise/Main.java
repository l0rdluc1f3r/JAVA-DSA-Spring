package com.lucifer.DataStructures.LinkedList.Rewise;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertFirst(13);
        list.insertLast(100);
        list.insert(12,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();
//        list.insertRec(88, 2);
//        list.display();

        // DOUBLY LINKED LIST
//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(10);
//        list.insertFirst(11);
//        list.insertFirst(13);
//        list.insertLast(99);
//        list.display();

        // CIRCULAR LINKED LIST
//        CLL list = new CLL();
//        list.insert(4);
//        list.insert(6);
//        list.insert(9);
//        list.insert(13);
//        list.insert(17);
//
//        list.display();
    }
}
