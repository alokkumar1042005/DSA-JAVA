package Loop;
import java.util.Scanner;
public class Power_of_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int mul1 = 0 ;
        for(int i = 1; i<=a ; i++){
            mul1 = mul1 + n * n;

        }
        System.out.println(mul1);
    }
}
