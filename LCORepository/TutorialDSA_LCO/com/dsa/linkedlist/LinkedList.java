package com.dsa.linkedlist;
public class LinkedList {

    Node head=null;
        
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        System.out.println("\n    Length of the linked list counted by recursion is "+linkedList.getCount()+"\n");

        System.out.println("    Base Linked List.");
        String[] nodes={"Ruturaj","Robin","Moeen","Rayudu","Jadeja"};
        linkedList.addNodes(nodes);
        linkedList.printList();
        System.out.println("    After pushing Dhoni.");
        linkedList.push("Dhoni");
        linkedList.printList();

        System.out.println("    After inserting Bravo at 4");
        Node prevNode=linkedList.head;
        for(int i=1;i<3;i++){
        prevNode=prevNode.next;
        }
        linkedList.insertAt(prevNode,"Bravo");
        linkedList.printList();

        System.out.println("    After appending Dube");
        linkedList.append("Dube");
        linkedList.printList();

        System.out.println("\n    Length of the linked list is "+linkedList.length());
        System.out.println("\n    Length of the linked list counted by recursion is "+linkedList.getCount()+"\n");

        System.out.println("    After deletion position at 4 ");
        linkedList.deleteAtPosition(7);
        linkedList.printList();

        System.out.println("    After deletion Robin ");
        linkedList.deleteNodeByValue("Robin");
        linkedList.printList();

        linkedList.deleteList();
        linkedList.printList();
    }


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
        head=newNode;
    }

    public void insertAt(Node prevNode,String newData){
        if(prevNode==null){
            System.out.println("Previus Node is null. Can not proceed with insertion.");
            return;
        }else{

        }
        Node newNode=new Node(newData);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }

    public void append(String newData){
        
        if(head==null){
            push(newData);
        }else{
            Node newNode=new Node(newData);
            newNode.next=null;

            Node lastNode=head;

            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;

        }
        
    }

    public void addNodes(String[] dataList){

        for(String data:dataList){
            append(data);
        }
    }

    public void printList(){
        System.out.print("\n\n");

        if(head==null){
            System.out.print("    List is empty .");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print("    "+currentNode.data+" ==> ");
            currentNode=currentNode.next;
        }
        System.out.print("\n\n");
    }

    //Position starts from 0 i.e. zero
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("\n    Linked list is empty. Can not proceed with deletion of node at position "+position);
            return;
        }else{
            Node currentNode=head;
            Node prevNode=null;

            for(int i=0;i<=position;i++){

                if(i==position){
                    if(prevNode!=null){
                        prevNode.next=currentNode.next;
                        currentNode=null;
                    }else{
                        head=head.next;
                    }
                }else{
                    prevNode=currentNode;
                    if(currentNode.next==null){
                        System.out.println("\n    Linked list is of length "+(i+1)+". Can not proceed with deletion of node at position "+position);
                        return;
                    }else{
                        currentNode=currentNode.next;
                    }
                    
                }
                
                
            }
        }
        
    }

    public void deleteNodeByValue(String nodeValue){

        Node currentNode=head;
        Node prevNode=null;
        if(head==null){
            System.out.println("\n    Linked list is empty. Can not proceed with deletion of node with value "+nodeValue);
            return;
        }else{
            boolean deleted=false;
            while(currentNode!=null){
                if(currentNode.data.equals(nodeValue)){
                    if(prevNode==null){
                        head=currentNode.next;
                    }else{
                        prevNode.next=currentNode.next;
                    }
                    currentNode=null;
                    deleted=true;
                    break;
                }else{
                    prevNode=currentNode;
                    currentNode=currentNode.next;
                }
            }

            if(!deleted){
                System.out.println("\n    Node with value "+nodeValue+" can not be found.");
            }
        }

    }

    public void deleteList(){
        head=null;
        System.out.println("\n    List is deleted.");
    }

    public int length(){
        int lenght=0;
        Node currentNode=head;
        while(currentNode!=null){
            lenght++;
            currentNode=currentNode.next;
        }
        return lenght;
    }

    public int countNodes(Node node){
        if(node==null){
            return 0;
        }else{
            return 1+countNodes(node.next);
        }
    }

    public int getCount(){
        return countNodes(head);
    }

    public Node reverseLinkedList(Node node){
        Node currentNode=node;
        Node prevNode=null;
        Node nextNode=null;

        while(currentNode!=null){     
            nextNode=currentNode.next;
            currentNode.next=prevNode;

            prevNode=currentNode;
            currentNode=nextNode;      
        }
        node=prevNode;
        return node;

    }

    public void reverse(){
        head=reverseLinkedList(head);

    }
}


