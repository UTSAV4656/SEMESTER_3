package LAB_13;
import java.util.Scanner;

class Node {
    int data;
    Node link;
    
    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class CircularLinkedList {
    Node head;
    
    CircularLinkedList() {
        this.head = null;
    }
    
    // Insert a node at the first
    void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.link = head;
        } else {
            newNode.link = head;
            Node save = head;
            while (save.link != head) {
                save = save.link;
            }
            save.link = newNode;
            head = newNode;
        }
    }
    
    // Insert a node at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.link = head;
        } else {
            Node save = head;
            while (save.link != head) {
                save = save.link;
            }
            save.link = newNode;
            newNode.link = head;
        }
    }
    
    // Delete a node from a specified position
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node save = head;
        if (position == 0) {
            if (save.link == head) {
                head = null;
            } else {
                while (save.link != head) {
                    save = save.link;
                }
                save.link = head.link;
                head = head.link;
            }
            return;
        }
        
        Node prev = null;
        int count = 0;
        while (save.link != head && count != position) {
            prev = save;
            save = save.link;
            count++;
        }
        
        if (save.link == head) {
            System.out.println("Position out of bounds.");
            return;
        }
        
        prev.link = save.link;
    }
    
    // Display all nodes
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node save = head;
        do {
            System.out.print(save.data + " ");
            save = save.link;
        } while (save != head);
        System.out.println();
    }
}

public class Lab_13_71 {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Delete a node from a specified position");
            System.out.println("3. Insert a node at the end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int frontData = scanner.nextInt();
                    cll.insertAtFront(frontData);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    cll.deleteAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter data to insert at the end: ");
                    int endData = scanner.nextInt();
                    cll.insertAtEnd(endData);
                    break;
                case 4:
                    cll.display();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
