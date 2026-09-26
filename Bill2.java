package Conditional_statement;

import java.util.Scanner;
public class Bill2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double amount = 0;
        if(unit>401){
            amount += ((unit-400)*13);
            unit = 400;
        } if (unit>201 && unit<=400){
            amount += ((unit-200)*8);
            unit = 200;
        }if (unit>101 && unit<=200){
            amount += ((unit-100)*6);
            unit = 100;
        }
        amount += unit *4.2;
        unit = 100;
        System.out.println(+amount);
    }
}
