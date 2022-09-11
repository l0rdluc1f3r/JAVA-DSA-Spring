package com.lucifer.DataStructures.LinkedList.Code;

import java.util.List;

public class InterviewQues {
    // LEETCODE 141
    // AMAZON AND MICROSOFT
//    public boolean hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                return true;
//            }
//        }
//    }

    // FIND THE LENGTH OF THE CYCLE
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = fast.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        // find the start node
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s = s.next;
            length--;
        }
        // keep moving forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }


    // LEETCODE 202
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    // LEETCODE 876
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }












    class ListNode {
        int val;
        ListNode next;

        public ListNode(){

        }
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}





