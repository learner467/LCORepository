package com.dsa.circularlinkedlist;

public class CircularLinkedList {
    Node head=null;

    class Node{
        String data;
        Node next;
    
        Node(String data){
            this.data=data;
            next=null;
        }
    }

    //Initialize Linked List
    public void push(String newData){
        Node newNode=new Node(newData);
        newNode.next=head;

        Node temp=head;
        if(head!=null){
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
        }else{
            newNode.next=newNode;
        }
        head=newNode;
    }

    public void printList(){
        Node currentNode=head;

        if(head==null){
            System.out.print("    List is empty .");
            return;
        }
       do{
            System.out.print("    "+currentNode.data+" ==> ");
            currentNode=currentNode.next;     
        }while(currentNode!=head);
    }

    //Position starts from 0 i.e. zero
    public void deleteNodeAtPosition(int position){
        if(head==null){
            System.out.print("    List is empty .Can not proceed with deletion of node at position "+position);
            return;
        }

        Node currentNode=head.next;
        Node prevNode=null;
        int i=1;
        
        while(currentNode!=head){
            if(i==position){
                
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList=new CircularLinkedList();
        //System.out.println("\n    Length of the linked list counted by recursion is "+linkedList.getCount()+"\n");

        System.out.println("\n\n    Base Linked List.\n");
        circularLinkedList.push("Moeen");
        circularLinkedList.push("Robin");
        circularLinkedList.push("Ruturaj");

        circularLinkedList.printList();

        System.out.println("\n\n    END.\n");
    }
}
