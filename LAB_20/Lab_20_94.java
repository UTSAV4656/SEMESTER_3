package LAB_20;

import java.util.Scanner;

public class Lab_20_94 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
			System.out.println("Enter value of arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
        sc.close();
        System.out.println("Original arr:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted arr:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
