import java.util.Scanner;
public class Grade_system_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int a = sc.nextInt();
        if (a >= 75 && a <= 100) {
            System.out.println("Grade =  A ");
        } else if (a >= 60 && a <= 74) {
            System.out.println("Grade =  B ");
        } else if (a >= 40 && a <= 59) {
            System.out.println("Grade =  C ");
        } else if (a >= 36 && a <= 49) {
            System.out.println("Grade = D");
        } else if (a > 100) {
            System.out.println("Enter number under 100");
        } else {
            System.out.println("Fail");
        }
    }
}
