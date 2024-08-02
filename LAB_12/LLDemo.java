package LAB_12;

public class LLDemo {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        Node temp = first;
        first = newNode;
        first.link = temp;
        System.out.println("Ater inserted at First ->");
        displayLinkedList();
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            System.out.println("After inserted at End ->");
            displayLinkedList();
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
        System.out.println("After inserted at End ->");
        displayLinkedList();
    }

    public LLDemo copyLinkedList() {
        if (first == null) {
            System.out.println("Linked List is Empty");
            return null;
        }
        Node save = first;
        LLDemo copyLL = new LLDemo();
        copyLL.first = new Node(save.info);
        Node saveCopy = copyLL.first;

        save = save.link;
        while (save != null) {
            saveCopy.link = new Node(save.info);
            saveCopy = saveCopy.link;
            save = save.link;
        }
        return copyLL;
    }

    public void displayLinkedList() {
        if (first == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info);
            if (save.link != null) {
                System.out.print("->");
            }
            save = save.link;
        }
        System.out.println();
    }

    public void reverseLL() {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node prev = null, next = null;
        Node current = first;

        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        first = prev;
        System.out.println("After Reversing LinkedList -> ");
        displayLinkedList();
    }

    public void sortLL() {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save;
        boolean flag;
        do {
            save = first;
            flag = false;

            while (save.link != null) {
                if (save.info > save.link.info) {
                    int temp = save.info;
                    save.info = save.link.info;
                    save.link.info = temp;
                    flag = true;
                }
                save = save.link;
            }
        } while (flag);
        System.out.println("After Sorting a LinkedList -> ");
        displayLinkedList();
    }
}