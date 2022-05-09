package com.dsa.queue;

public class CircularQueue {
    
    static class Queue{
        int front, rear;
        int [] Q;

        public Queue(int size){
            Q=new int[size];
            front=-1;
            rear=-1;
        }

        public void enqueue(int data) {

            if(rear==-1 && front==-1){//Queue is empty
                front=0;
                rear=0;
                Q[rear] = data;
                return;

            }
            
            if((rear+1)%Q.length==front && Q[front]!=0){
                System.out.println("Queue is full");
                return;
            }

            rear=(rear+1)%Q.length;
            Q[rear] = data;
        }
    
        public int dequeue() {
            if (front==-1 || Q[front]==0) {
                System.out.println("Queue is already empty");
                return -1;
            }

            int popval = Q[front];
            Q[front]=0;
            front = (front + 1) % Q.length;
            return popval;
        }

        public void printQ(){
            System.out.print("              Queue is:");
            for(int i:Q){
                System.out.print(" "+i);
            }
            System.out.println("  . Front: "+front+" Rear: "+rear);
            
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);

        q.printQ();
        q.enqueue(10);
        System.out.println("\nAfter enqueue: 10. ");
        q.printQ();
        q.enqueue(20);
        System.out.println("\nAfter enqueue: 20. ");
        q.printQ();
        q.enqueue(30);
        System.out.println("\nAfter enqueue: 30. ");
        q.printQ();
        q.enqueue(40);
        System.out.println("\nAfter enqueue: 40. ");
        q.printQ();
        q.enqueue(50);
        System.out.println("\nAfter enqueue: 50. ");
        q.printQ();
        q.enqueue(60);
        System.out.println("\nAfter enqueue: 60. ");
        q.printQ();
        q.enqueue(70);
        System.out.println("\nAfter enqueue: 70. ");
        q.printQ();
        System.out.println("\n\n");

        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("\n\n");

        q.enqueue(50);
        System.out.println("\nAfter enqueue: 50. ");
        q.printQ();
        q.enqueue(60);
        System.out.println("\nAfter enqueue: 60. ");
        q.printQ();
        q.enqueue(70);
        System.out.println("\nAfter enqueue: 70. ");
        q.printQ();
        System.out.println("\n\n");

        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("After dequeue: "+q.dequeue());
        q.printQ();
        System.out.println("\n\n");

        q.enqueue(50);
        System.out.println("\nAfter enqueue: 50. ");
        q.printQ();
        q.enqueue(60);
        System.out.println("\nAfter enqueue: 60. ");
        q.printQ();
        q.enqueue(70);
        System.out.println("\nAfter enqueue: 70. ");
        q.printQ();
        q.enqueue(80);
        System.out.println("\nAfter enqueue: 80. ");
        q.printQ();
        q.enqueue(90);
        System.out.println("\nAfter enqueue: 90. ");
        q.printQ();
        System.out.println("\n\n");


    }

    
}
