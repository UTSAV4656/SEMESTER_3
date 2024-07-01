import java.util.*;
public class LAB_3_A_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        int temp = 0;

        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            temp+=a[i];
        }
        int avg = temp/n;
        System.out.println("Average of array is: "+avg);
        sc.close();
    }
}
