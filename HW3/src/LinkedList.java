import java.sql.PseudoColumnUsage;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newMode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newMode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode = newMode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    public void forEach(java.util.function.Consumer consumer)
    {
        for(Node currentNode = head; currentNode != null; currentNode = currentNode.next)
        {
            consumer.accept(currentNode);
        }
    }

    public void printList() {
        Node currentNode = head;

        if (head != null) {
            System.out.println(head.data);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }
}
