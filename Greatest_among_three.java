package Conditional_statement;

import java.util.Scanner;

public class Greatest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c = ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All three numbers are equal");
        }
        else if (a >= b && a >= c) {
            System.out.println("a is the largest among three numbers");
        }
        else if (b >= a && b >= c) {
            System.out.println("b is the largest among three numbers");
        }
        else {
            System.out.println("c is the largest among three numbers");
        }
        sc.close();
    }
}
