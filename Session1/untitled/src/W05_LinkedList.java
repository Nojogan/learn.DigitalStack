
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node nodeToBeAdded = new Node(data);

        if (head == null) {
            head = nodeToBeAdded;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodeToBeAdded;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data + " -> null");
    }

    public Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}

public class W05_LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.display();
        System.out.println(linkedList.findMiddle().data);

        linkedList.add(6);
        linkedList.display();
        System.out.println(linkedList.findMiddle().data);
    }
}
