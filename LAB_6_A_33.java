package Lab6;

import java.util.Scanner;

class swap {
    int a,b;
    public void swapNo(){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("----After Swaping----");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

public class LAB_6_A_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        swap s = new swap();
        s.a = a;
        s.b = b;
        s.swapNo();
        sc.close();
    }
}
