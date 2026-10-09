package Loop;
import java.util.Scanner;
public class N_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i>=1; i--){
            System.out.println(i);
        }
    }
}
