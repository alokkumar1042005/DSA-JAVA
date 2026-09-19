import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value for calculation = ");
        int a = sc.nextInt();
        System.out.println("enter the second value for calculation = ");
        int b = sc.nextInt();
        System.out.println("enter one sign from this  + , - , * , / ,  = ");
        char sign = sc.next().charAt(0);

        if(sign == '+'){
            System.out.println("the addition is =" +(a+b));
        }
        else if(sign == '-'){
            System.out.println("the subtraction is =" +(a-b));

        }
        else if(sign == '*'){
            System.out.println("the multiplication is =" +(a*b));
        }
        else if(sign == '/'){
            System.out.println("the division is =" +((float)a/b));

        }
        else{
            System.out.println("invalid input");
        }
    }
}
