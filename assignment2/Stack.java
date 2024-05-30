package assignment2;
public class Stack {
    private Node top;
    public Stack() {
        top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
}