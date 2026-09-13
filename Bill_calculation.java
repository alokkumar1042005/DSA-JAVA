import java.util.Scanner;
public class Bill_calculation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit consuption = ");
        int unit = sc.nextInt();

        if (unit>0 && unit<=100){
            System.out.println("Bill = " +(unit*5));
        }
        else if (unit>101 && unit<=200){
            System.out.println("Bill = " +(unit*7));
        }
        else{
            System.out.println("Bill = " +(unit*10));
        }
    }
}

