
import java.util.Scanner;
import java.util.Stack;

public class Lab_8_47 {

    public static int evalPost(String postfix){
        Stack<Integer> stk= new Stack<>();
        int value=0;
        char temp;
        for (int i = 0; i < postfix.length(); i++) {
            temp=postfix.charAt(i);
            if(Character.isDigit(temp)){
                stk.push(Integer.parseInt(String.valueOf(temp)));
            }else{
                int op2=stk.pop();
                int op1=stk.pop();

                switch (temp) {
                    case '+':
                        value=op1+op2;
                        break;
                    case '-':
                        value=op1-op2;
                        break;
                    case '*':
                        value=op1*op2;
                        break;
                    case '/':
                        value=op1/op2;
                        break;
                    case '^':
                        value=(int) Math.pow(op1, op2);
                        break;
                
                    default:
                        break;
                }
            stk.push(value);

            }
        }
        return stk.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Postfix String : ");
        String postfix=sc.nextLine();

        System.out.println(evalPost(postfix));
    }
}
