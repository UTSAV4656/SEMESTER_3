
import java.util.Scanner;
public class LAB_4_A_22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n-1]; 
		for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			a[i] = sc.nextInt();
		}
        System.out.print("Enter number you want to delete : ");
		int num = sc.nextInt();
		int j=0;
		for(int i=0;i<b.length;i++,j++){
			if(num == a[i]){
				b[i]=a[j+1];
			}
			else{
				b[i] = a[j];
			}
		}
		System.out.println("After deletion : ");
		for(int i=0;i<b.length;i++){
			System.out.println("Value of arr["+i+"] : "+b[i]);
		}
		sc.close();
	}
}
