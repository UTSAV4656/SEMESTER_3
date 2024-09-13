package LAB_21;

public class Lab_21_97 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 6, 3, 8 };
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void QuickSort(int k[],int LB,int UB){
        boolean flag = true;
        if(LB < UB){
            int i = LB , j = UB + 1 , key = k[LB];
            while(flag){
                i = i+1;
                while(k[i] < key){
                    i++;
                }
                j = j-1;
                while(k[j] > key){
                    j = j-1;
                }
                if(i < j){
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;    
                }
                else{
                    flag = false;
                }
            }
            int temp = k[LB];
            k[LB] = k[j];
            k[j] = temp;
            QuickSort(k,LB,j-1);
            QuickSort(k,j+1,UB);
        }
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
