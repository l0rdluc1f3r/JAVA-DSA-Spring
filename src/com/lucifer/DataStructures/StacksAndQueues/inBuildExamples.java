package com.lucifer.DataStructures.StacksAndQueues;

import java.util.*;

public class inBuildExamples {
    public static void main(String[] args) {
        // STACK
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        // QUEUE
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(7);
//        queue.add(2);
//        queue.add(8);
//        queue.add(6);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(77);
        deque.addLast(33);
        System.out.println(deque.removeFirst());
    }
}















