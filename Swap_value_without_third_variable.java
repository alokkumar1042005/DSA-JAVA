import java.util.Scanner;
public class Swap_value_without_third_variable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a  =");
        int a = sc.nextInt();
        System.out.println("Enter the value of b =");
        int b = sc.nextInt();
        a = b-a;
        b = b-a;
        a = a+b;
        System.out.println("after swap the vlue of a is = " +a);
        System.out.println("after swap the value of b is = " +b);
    }
}