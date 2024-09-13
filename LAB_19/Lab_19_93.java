package LAB_19;
import java.util.Scanner;
public class Lab_19_93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
        sc.close();
        System.out.println("Original arr:");
        printarr(arr);

        insertionSort(arr);

        System.out.println("Sorted arr:");
        printarr(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
