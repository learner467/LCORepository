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
        System.out.println("\n ");
    }

    //Position starts from 0 i.e. zero
    public void deleteNodeAtPosition(int position){
        if(head==null){
            System.out.println("\n    List is empty .Can not proceed with deletion of node at position "+position+"\n");
            return;
        }else if(position<0){
            System.out.println("\n    Invalid position. Can not proceed with deletion of node at position "+position+"\n");
            return;
        }

        Node currentNode=head;
        Node prevNode=null;
        Node nextNode=null;
        int i=0;
        do{
            if(position-1==i){
                prevNode=currentNode;
            }else if(position==0 && currentNode.next==head){
                prevNode=currentNode;
            }

            if(position==i){
                nextNode=currentNode.next;
            }
            
            currentNode=currentNode.next;
            i++;
        }while(currentNode!=head);

        if(prevNode==null || nextNode==null){
            System.out.println("\n    Linked list is of length "+(i)+". Can not proceed with deletion of node at position "+position);
        }else{
            if(prevNode==nextNode){
                head=null;
                return;
            }
            if(prevNode.next==head){
                head=nextNode;
            }
            prevNode.next=nextNode; 
        }
    }

    public void deleteNode(Node deleteNode){
        if(head==null){
            System.out.println("\n    List is empty .Can not proceed with deletion of node.\n");
            return;
        }else if(deleteNode==null){
            System.out.println("\n    Provided node is empty .Can not proceed with deletion of node.\n");
            return;
        }

        Node currentNode=head;
        Node prevNode=null;
        Node nextNode=null;

        do {
            if(deleteNode==currentNode.next){
                prevNode=currentNode;
            }

            if(deleteNode==currentNode){
                nextNode=currentNode.next;
            }

            currentNode=currentNode.next;

        }while(currentNode!=head);

        if(prevNode==null || nextNode==null){
            System.out.println("\n   Can not proceed with deletion of node as node is not found in list ");
        }else{
            if(prevNode==nextNode){
                head=null;
                return;
            }
            if(prevNode.next==head){
                head=nextNode;
            }
            prevNode.next=nextNode; 
        }

    }

    public int countNodes(){
        int i=0;
        if(head==null){
            System.out.println("\n    List is empty .List size is 0.\n");
            return i;
        }

        Node currentNode=head;
        
        do {
            i++;
            currentNode=currentNode.next;

        }while(currentNode!=head);
        return i;
    }


    public static void main(String[] args) {
        CircularLinkedList circularLinkedList=new CircularLinkedList();
        //System.out.println("\n    Length of the linked list counted by recursion is "+linkedList.getCount()+"\n");

        System.out.println("\n\n    Base Linked List.\n");
        circularLinkedList.push("Dhoni");
        circularLinkedList.push("Rayudu");
        circularLinkedList.push("Jadeja");
        circularLinkedList.push("Dube");
        circularLinkedList.push("Moeen");
        circularLinkedList.push("Robin");
        circularLinkedList.push("Ruturaj");

        circularLinkedList.printList();

        System.out.println("    After deletion position at 4 ");
        circularLinkedList.deleteNodeAtPosition(0);

        circularLinkedList.printList();
        String emp=null;
        System.out.println("    After deletion positio:"+emp+":");

        CircularLinkedList circularLinkedList1=new CircularLinkedList();
        System.out.println("\n\n    Base Linked List.\n");
        circularLinkedList1.push("Dhoni");
        circularLinkedList1.push("Dube");
        circularLinkedList1.push("Moeen");
        circularLinkedList1.push("Robin");
        circularLinkedList1.printList();

        System.out.println("    After deletion :");
        circularLinkedList1.deleteNode(circularLinkedList1.head.next);
        circularLinkedList1.printList();

        System.out.println("    Size if  circularLinkedList1 is : "+circularLinkedList1.countNodes());

        

        System.out.println("\n\n    END.\n");
    }
}
