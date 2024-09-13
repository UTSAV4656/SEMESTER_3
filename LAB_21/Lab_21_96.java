package LAB_21;

public class Lab_21_96 {
    public static void mergeSort(int[] arr, int LB, int UB) {
        if (LB >= UB) {
            return;
        }
        int mid = (LB + UB) / 2;
        mergeSort(arr, LB, mid);
        mergeSort(arr, mid + 1, UB);

        merge(arr, LB, mid, UB);
    }

    public static void merge(int[] arr, int LB, int mid, int UB) {
        int[] temp = new int[UB - LB + 1];
        int i = LB, j = mid + 1, k = 0;

        while (i <= mid && j <= UB) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        if (i > mid) {
            while (j <= UB) {
                temp[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
        }
        for (k = 0, i = LB; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 6, 3, 8 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}