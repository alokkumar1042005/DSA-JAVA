import java.util.Scanner;
public class Profit_loss_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price of product  =");
        int cp = sc.nextInt();
        System.out.println("enter the selling price of product  =");
        int sp = sc.nextInt();
        int profit = sp-cp;
        int loss = cp-sp;
        float profit_percent = ((float)profit/cp)*100;
        float loss_percent = ((float)loss/cp)*100;
        if(cp<sp){
            System.out.println("the profit is ₹"   +profit + " And profit percentage = " +profit_percent);
        }
        else if(cp==sp){
            System.out.println("no profit no loss");
        }
        else{
            System.out.println("the loss is ₹" +loss +" And loss percentage = " +loss_percent);
        }
    }
}
