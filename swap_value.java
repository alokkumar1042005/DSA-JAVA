import java.util.Scanner;
public class swap_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value for swap  = ");
        int a = sc.nextInt();
        System.out.println("enter second value for swap = ");
        int b = sc.nextInt();
        System.out.println("value before swapping =  " +a + " and " + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("value after swapping = " +a + " and " + b);
    }
}
