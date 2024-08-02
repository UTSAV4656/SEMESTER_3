package LAB_12;
import LAB_12.LLDemo;
import java.util.Scanner;

public class Lab_12_63_64_65 {
    public static void main(String[] args) {
        LLDemo l1 = new LLDemo();
        Scanner sc = new Scanner(System.in);
        int userChoice;
        System.out.println("Enter => \n1 to insertNode at first\n" + //
                "2 to insertNode at last\n" + //
                "3 to copy LinkedList\n" + //
                "4 to display LinkedList\n" + //
                "5 to Reverse a LinkedList\n "+ //
                "6 to Sort a LinkedList\n ");
        while (true) {
            System.out.print("Choice : ");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter Element To Insert : ");
                    int n = sc.nextInt();
                    l1.insertAtFirst(n);
                    break;
                case 2:
                    System.out.print("Enter Element To Insert : ");
                    int m = sc.nextInt();
                    l1.insertAtEnd(m);
                    break;
                case 3:
                    LLDemo copy = l1.copyLinkedList();
                    System.out.println("Copy Of LinkedList : ");
                    copy.displayLinkedList();
                    break;
                case 4:
                    l1.displayLinkedList();
                    break;
                case 5:
                    l1.reverseLL();
                    break;
                case 6:
                    l1.sortLL();
                    break;   
                default:
                    System.out.println("Enter Valid Input ");
                    break;
            }
        }
    }
}