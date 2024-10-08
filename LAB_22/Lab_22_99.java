package LAB_22;

public class Lab_22_99 {
    public static void shellSort(int [] arr){
        int n = arr.length;
        for(int gap=n/2 ; gap>=1 ; gap = gap/2){
            for(int j=gap ; j<n ; j++){
                for(int i=j-gap ; i>=0 ; i=i-gap){
                    if(arr[i+gap] > arr[i]){
                        break;
                    }
                    else{
                        int temp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {62,85,61,26,43,38};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
