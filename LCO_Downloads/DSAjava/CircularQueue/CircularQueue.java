// # 34, 45, 46, 67, 78, 89, 23, 34
// # 0, 1, 2, 3, 4, 5, 6, 7
// # R F
// #
// # (rear + 1) % size == front)
// #
// #

/**
 * CircularQueue
 */
public class CircularQueue {

    static class Queue {
        int front, rear;
        int[] Q;

        public Queue(int size) {
            Q = new int[size + 1];
            front = 0;
            rear = 0;
        }
    }

    public void enqueue(int data) {
        rear = (rear + 1) % Q.length;
        if (rear == front) {
            System.out.println("Queue is full");
            return;
        }
        if (rear = 0) {
            rear = q.length - 1;
        } else {
            rear = rear - 1;
        }
        Q[rear] = data;
    }

    public int dequeue() {
        if (rear == front) {
            System.out.println("Queue is already empty");
            return -1;
        }
        int popval = Q[front];
        front = (front + 1) % Q.length;
        return popval;
    }

}