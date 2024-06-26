import java.util.Scanner;
public class LAB_4_A_21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] a = new int[n+1]; 
		for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			p[i] = sc.nextInt();
		}
        System.out.print("Enter index : ");
		int index = sc.nextInt();
		System.out.print("Enter number you want to enter : ");
		int num = sc.nextInt();
		int j=0;
		for(int i=0;i<a.length;i++,j++){
			if(index == i){
				a[i] = num;
				j--;
			}
			else{
				a[i] = p[j];
			}
		}
		System.out.println("After insertion : ");
		for(int i=0;i<a.length;i++){
			System.out.println("Value of arr["+i+"] : "+a[i]);
		}
		sc.close();
	}
}