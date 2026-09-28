package Loop;
import java.util.Scanner;
public class OddEven_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumeven  = 0;
        int sumodd = 0;
        for(int i = 1; i <= n; i++){
            if(i%2==0) {
                sumeven += i;
            }
            else{
                sumodd += i;
            }
        }
        System.out.println("SumEven =" +sumeven);
        System.out.println("SumOdd =" +sumodd);

    }
}
