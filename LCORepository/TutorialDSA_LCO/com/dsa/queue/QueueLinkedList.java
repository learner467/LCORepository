package com.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> myq = new LinkedList<String>();

        myq.add("superman");
        myq.add("batman");
        myq.add("flash");

        System.out.println("My Elements are: " + myq);
        System.out.println("Remove " + myq.remove()+"\n");
        System.out.println("My Elements are: " + myq);

        System.out.println("element " + myq.element()+"\n");
        System.out.println("My Elements are: " + myq);

        System.out.println("poll(): " + myq.poll()+"\n");
        System.out.println("My Elements are: " + myq);

        System.out.println("peek(): " + myq.peek()+"\n");
        System.out.println("My Elements are: " + myq);

        System.out.println("peek(): " + myq.peek()+"\n");
        System.out.println("My Elements are: " + myq);
    }
}
