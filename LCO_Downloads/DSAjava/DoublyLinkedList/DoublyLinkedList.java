/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);

        new_node.next = head;
        new_node.prev = null;

        if (head != null) {
            head.prev = new_node;
        }

        head = new_node;

    }

    public void insertAfter(Node prev_node, int new_data) {

        if (prev_node == null) {
            System.out.println("prev node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

    }

    void addatend(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;

    }

    void deleteNode(Node head_ref, Node key) {

        if (head == null || key == null) {
            return;
        }

        // case 1

        if (head == key) {
            head = key.next;
        }

        // case 2
        if (key.next != null) {
            key.next.prev = key.prev;
        }

        if (key.prev != null) {
            key.prev.next = key.next;
        }
        // Free up the memory

        return;

    }

    void printlist(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();

        dlist.push(3);
        dlist.push(4);
        dlist.push(6);
        dlist.printlist(dlist.head);
    }

}