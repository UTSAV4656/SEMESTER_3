import java.util.Scanner;
public class LAB_4_A_23{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of sorted array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[a.length+1]; 
		for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			a[i] = sc.nextInt();
		}
        System.out.println("Enter value to be insert:");
        int num = sc.nextInt();
        boolean inserted = false;
        for (int i = 0, j = 0; i < a.length; i++, j++) {
            if (!inserted && a[i] > num) {
                b[j] = num;
                j++;
                inserted = true;
            }
            b[j] = a[i];
        }
        if (!inserted) {
            b[a.length] = num;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println("new"+i+"element"+b[i]);
        }
        sc.close();
        }
}