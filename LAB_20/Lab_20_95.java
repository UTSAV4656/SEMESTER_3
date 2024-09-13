package LAB_20;
public class Lab_20_95 {
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        int exp = 1;
        while (max / exp > 0) {
            countingSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countingSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array:");
        printArray(arr);
        radixSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}