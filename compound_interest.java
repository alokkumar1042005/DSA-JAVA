import java.util.Scanner;
public class compound_interest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount = ");
        int pa = sc.nextInt();
        System.out.println("enter the interest rate=");
        double R = sc.nextDouble();
        double r = R/100;
        System.out.println("enter the time in years=");
        int years = sc.nextInt();
        double fa = pa*(Math.pow(1+r,years));
        System.out.println("the final amount is =" +fa);
    }
}
