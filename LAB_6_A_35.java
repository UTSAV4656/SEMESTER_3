package Lab6;

import java.util.Scanner;

class Student_Detais{
    int Enrollment_No;
    String name;
    String semester;
    double CPI;
    public void Set_Student_Detais(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment_No: ");
        Enrollment_No = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter semester: ");
        semester = sc.next();
        System.out.println("Enter CPI: ");
        CPI = sc.nextDouble();
    }
    public void Display_Student_Detais(){
        System.out.println("Enrollment_No: "+Enrollment_No);
        System.out.println("name: "+name);
        System.out.println("semester: "+semester);
        System.out.println("CPI: "+CPI);
    }

}

public class LAB_6_A_35 {
    public static void main(String[] args) {
        Student_Detais[] s = new Student_Detais[5];
        for(int i=0;i<5;i++){
            s[i] = new Student_Detais();
            System.out.println("Enter details of student"+(i+1)+":");
            s[i].Set_Student_Detais();
        }
        for(int i=0;i<5;i++){
            System.out.println("Details of student"+(i+1)+":");
            s[i].Display_Student_Detais();
        }
    }
}
