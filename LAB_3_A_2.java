import java.util.*;
public class LAB_3_A_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    int a = sc.nextInt();
    System.out.println("Enter Second Number");
    int b = sc.nextInt();
    int ans=0;
    for(int i=a;i<=b;i++){
        ans += i;
    }
    System.out.println("Ans:"+ans);
    sc.close();
}
}
