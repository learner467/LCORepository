package com.dsa.linkedlist;

public class ReverseLinkedList {
    
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        
        System.out.println("    Base Linked List.");
        String[] nodes={"Ruturaj","Robin","Moeen","Rayudu","Jadeja"};
        linkedList.addNodes(nodes);
        linkedList.printList();

        System.out.println("    Linked List after reversal");
        linkedList.reverseLinkedList();
        linkedList.printList();
    }

}
