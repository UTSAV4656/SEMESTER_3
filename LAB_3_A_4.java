import java.util.*;
public class LAB_3_A_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        int s = a[0];
        int l = a[0];
        for(int i=0;i<n;i++){
            if(a[i]>l){
                l=a[i];
            }
            if(a[i]<s){
                s=a[i];
            }
    
    }
    System.out.println("Smallest element is: "+s);
    sc.close();
}
}