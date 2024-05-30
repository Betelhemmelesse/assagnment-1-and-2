package assignment2;
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Test insertion
        System.out.println("Inserting 10 at position 1 or index 0:");
        list.insertAtPos(45, 1);
        printList(list);

        System.out.println("Inserting 20 at position 2 or index 1:");
        list.insertAtPos(56, 2);
        printList(list);

        System.out.println("Inserting 30 at position 3 or index 2:");
        list.insertAtPos(67, 3);
        printList(list);

        // Test deletion
        System.out.println("Deleting element at position 2:");
        list.deleteAtPosition(2);
        printList(list);
        // Test search
        System.out.println("Is element 67 present? " + list.searchNode(67));
        System.out.println("Is element 25 present? " + list.searchNode(25));
    }
    public static void printList(LinkedList list) {
        Node current = list.head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
