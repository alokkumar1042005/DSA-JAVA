package Loop;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n;

        int rev = 0;
        while(n>0){
            int num = n % 10 ;
            n = n /10 ;
            rev = rev * 10 + num;
        }
        if (rev==num1)System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}





