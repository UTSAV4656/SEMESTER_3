package LAB_C;

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
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public static boolean areIdentical(LinkedList list1, LinkedList list2) {
        Node current1 = list1.getHead();
        Node current2 = list2.getHead();

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        // If both lists are of the same length, current1 and current2 should both be null
        return current1 == null && current2 == null;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.append(1);
        list1.append(2);
        list1.append(3);

        list2.append(1);
        list2.append(2);
        list2.append(3);

        if (areIdentical(list1, list2)) {
            System.out.println("The linked lists are identical.");
        } else {
            System.out.println("The linked lists are not identical.");
        }

        list2.append(4);

        if (areIdentical(list1, list2)) {
            System.out.println("The linked lists are identical.");
        } else {
            System.out.println("The linked lists are not identical.");
        }
    }
}
