package com.dsa.doublylinkedlist;

public class DoublyLinkedList {
    
    Node head=null;

    class Node{
        String data;
        Node next;
        Node previous;

        Node(String data){
            this.data=data;
            next=null;
            previous=null;
        }
    }

    public void push(String data){
        Node node =new Node(data);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head.previous=node;
            head=node;
        }
    }

    public void printList(){
        Node currentNode=head;
        if(head==null){
            System.out.print("    List is empty .");
            return;
        }

        while(currentNode!=null){
            System.out.print("    "+currentNode.data+" ==> ");
            currentNode=currentNode.next;     
        }
        System.out.println("\n ");
    }

    public void insertAfter(Node prevNode, String data){
       

        if(prevNode==null){
            System.out.print("    PrevNode is Null .");
            return;
        }
        Node node=new Node(data);

        node.next=prevNode.next;
        node.previous=prevNode;

        prevNode.next=node;
        node.next.previous=node;

    }

    public void insertAtLast( String data){
       

        if(head==null){
            System.out.print("    List is Null .");
            return;
        }
        Node node=new Node(data);
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }

        node.previous=currentNode;
        currentNode.next=node;

    }

    public void deleteNodeByKey(String key){
        if(head==null){
            System.out.print("    List is empty .");
            return;
        }

        Node prevNode=null;
        Node nextNode=null;

        Node currentNode=head;
        while(currentNode!=null){
   
            if(currentNode.data.equals(key)){
                prevNode=currentNode.previous;
                nextNode=currentNode.next;

                if(head==currentNode){
                    head=currentNode.next;
                }
            }
            currentNode=currentNode.next; 
        } 

        if(prevNode!=null)
        prevNode.next=nextNode;
        if(nextNode!=null)
        nextNode.previous=prevNode;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        System.out.println("\n\n    Base Linked List.\n");

        doublyLinkedList.push("Dhoni");
        doublyLinkedList.push("Rayudu");
        doublyLinkedList.push("Jadeja");
        doublyLinkedList.push("Dube");
        doublyLinkedList.push("Moeen");
        doublyLinkedList.push("Robin");
        doublyLinkedList.push("Ruturaj");

        doublyLinkedList.printList();

        System.out.println("    Insert After.\n");
        doublyLinkedList.insertAfter(doublyLinkedList.head.next.next,"Santner");
        doublyLinkedList.printList();

        System.out.println("    Insert At Last.\n");
        doublyLinkedList.insertAtLast("Bravo");
        doublyLinkedList.printList();

        System.out.println("    Delete Node By Key.\n");
        doublyLinkedList.deleteNodeByKey("Ruturaj");
        doublyLinkedList.printList();
    }



}
