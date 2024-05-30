package assignment1;
public class ToDoList {
    private Node head;
    public ToDoList() {
        head = null;
    }
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    } public void markToDoascompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
        }
    }
    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            System.out.println("Task: " + current.getTask().getTitle());
            if (current.getTask().getDescription() != null) {
                System.out.println("Description: " + current.getTask().getDescription());
            }
            System.out.println("Completed: " + current.getTask().isCompleted());
            System.out.println();
            current = current.getNext();
        }
    }
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        todoList.addToDo(new Task("prepare for exam", "Applied,DSA, OOP"));
        todoList.addToDo(new Task("Finish Assagnment","DB,DSA,Applied"));
        todoList.addToDo(new Task("wash cloth","sweeter,towel,shoo"));
        todoList.markToDoascompleted("wash cloth");
        todoList.markToDoascompleted("Finish Assagnment");
        System.out.println("To-Do List:");
        todoList.viewToDoList();
    }
}
