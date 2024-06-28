package Lab6;

import java.util.Scanner;

class convert{
    float c,f;
    
    void convertCtoF(){
        System.out.println("Enter value of Celsius:");
        Scanner sc = new Scanner(System.in);
        c = sc.nextFloat();
        f=(c*9/5)+32;
        System.out.println("Fahrenheit is "+f);
        sc.close();
    }
    void convertFtoC(){
        System.out.println("Enter value of Fahrenhit:");
        Scanner sc = new Scanner(System.in);
        f = sc.nextFloat();
        c=(f-32)*5/9;
        System.out.println("Celsius is "+c);
        sc.close(); 
    }
}

public class LAB_6_B_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convert c=new convert();
        System.out.println("Enter a character for conversion C for C_TO_F and F for F_TO_C");
        char k = sc.next().charAt(0);
        if(k=='C' || k=='c'){
            c.convertCtoF();
        }   
        else if(k=='F' || k=='f'){
            c.convertFtoC();
        }
        else{
            System.out.println("Invalid Input");
        
        }
        sc.close();

    }
}
