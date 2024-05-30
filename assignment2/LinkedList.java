package assignment2;
public class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }
    public void insertAtPos(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid insertion");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position exceeds list size");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteAtPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position exceeds list size or list is empty");
            return;
        }
        current.next = current.next.next;
    }
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Invalid node or last node");
            return;
        }

        prevNode.next = prevNode.next.next;
    }
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

