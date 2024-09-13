package LAB_13;

import LAB_13.Data_Structure_Doubly_LL.*;
public class Lab_13_73 {
    public static void main(String[] args) {
        DBLY_LinkedList l1=new DBLY_LinkedList();
        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);
        l1.insertAtLast(6);
        l1.insertAtLast(7);

        l1.deleteAlternate(4);
        
        l1.displayLinkedList();
    }
}