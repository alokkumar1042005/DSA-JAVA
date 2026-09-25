import java.util.Scanner;
public class Voter_eligibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        int age1 = 18 - age;
        if(age>=18){
            System.out.println("You are eligible for votint");
        }
        else{
            System.out.println("You are not eligible for votint and " +(age1) + " year are left  for voting"  );
        }
    }
}
