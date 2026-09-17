import java.util.Scanner;
public class Tax_calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income for calculate tax  =");
        int income = sc.nextInt();
        if(0<=income && income<=200000){
            System.out.println("the tax will you is ₹ 0");
        }
        else if(200001<=income && income<=400000){
            System.out.println("the tax you will pay is ₹"    +((float)income*5)/100);
        }
        else if(400001<=income && income<=700000){
            System.out.println("the tax will you pay is ₹"    +((float)income*20)/100);
        }
        else{
            System.out.println("the tax you will pay is ₹"   +((float)income*30)/100);
        }
    }
}
