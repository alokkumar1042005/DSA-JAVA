package Loop;
import java.util.Scanner;
public class Strong_Number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n ;
        int fact2 = 0 ;
        while(n>0){
            int num = n % 10 ;
            int fact = 1;
            for(int i = num; i>=1; i-- ){
                fact = fact * i;
            }
            fact2  += fact ;
            n = n / 10 ;
        }
        if(num1==fact2){
            System.out.println(   num1  +" is strong number ");
        }
        else{
            System.out.println( num1 + "   is not strong number ");
        }
    }
}
