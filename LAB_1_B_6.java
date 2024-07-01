import java.util.*;
public class LAB_1_B_6 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no.");
    int x = sc.nextInt();
    System.out.println("Enter Power:");
    int y = sc.nextInt();
    int k=y;
    int z = 1;
    while (y!=0) {
        z=z*x;
        y--;

    }
    System.out.println(x+"^"+k+"="+z);
    sc.close();
}
    
}