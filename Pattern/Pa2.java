package EXTRA.Pattern;

public class Pa2 {
    public static void main(String[] args) {
        char c = 'A';
        int k = 1;
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                if(i%2 == 0){
                    System.out.print(""+c);
                    c++;
                }
                else{
                    System.out.print(""+k);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
