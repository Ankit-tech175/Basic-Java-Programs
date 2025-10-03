import java.util.*;
public class Solution {
    
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Insertion(Scanner sc) {
        int choice;
        do {
            System.out.print("\n# MENU\n1. At Beginning\n2. At End\n3. At Position\n4. Display\n5. Back to Main Menu\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> insertAtBeg(sc);
                case 2 -> insertAtEnd(sc);
                case 3 -> insertAtPos(sc);
                case 4 -> Display();
                case 5 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public void insertAtBeg(Scanner sc) {
        System.out.print("Enter value: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(Scanner sc) {
        System.out.print("Enter value: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }

    public void insertAtPos(Scanner sc) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position out of bounds, inserting at end.");
            if (head == null) head = newNode;
            else insertNodeAtEnd(newNode);
        }
    }

    private void insertNodeAtEnd(Node newNode) {
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }

    public void Deletion(Scanner sc) {
        int choice;
        do {
            System.out.print("\n# MENU\n1. At Beginning\n2. At End\n3. At Position\n4. Display\n5. Back to Main Menu\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> deleteAtBeg();
                case 2 -> deleteAtEnd();
                case 3 -> {
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    deleteAtPos(pos);
                }
                case 4 -> Display();
                case 5 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
    
    public void deleteAtBeg() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) current = current.next;
        current.next = null;
    }

    public void deleteAtPos(int pos) {
        if (head == null) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    public void Display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println();
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        head = prev; // Update head to new first node
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution list = new Solution();
        int choice;

        while (true) {
            System.out.print("\n# MAIN MENU\n1. Display\n2. Insertion\n3. Deletion\n4. Reverse\n5. Exit\nEnter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> list.Display();
                case 2 -> list.Insertion(sc);
                case 3 -> list.Deletion(sc);
                case 4 -> {
                    list.reverse();
                    System.out.println("List reversed.");
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}


