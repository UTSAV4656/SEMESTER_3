package Lab6;

import java.util.Scanner;

class Employee_Detail {
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Salary;

    public void Set_Employee_Detail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        Employee_ID = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        Employee_Name = sc.next();
        System.out.println("Enter Designation: ");
        Designation = sc.next();
        System.out.println("Enter Salary: ");
        Salary = sc.nextInt();
        sc.close();
    }

    public void Print_Detais(){
        System.out.println("Employee ID: "+Employee_ID);
        System.out.println("Employee Name: "+Employee_Name);
        System.out.println("Designation: "+Designation);
        System.out.println("Salary: "+Salary);
    }
    
}

public class LAB_6_A_34 {
    public static void main(String[] args) {
        Employee_Detail e1 = new Employee_Detail();
        e1.Set_Employee_Detail();
        e1.Print_Detais();
    }
}
