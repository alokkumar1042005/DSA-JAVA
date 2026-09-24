import java.util.Scanner;
public class switch_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of days number 1 to 7 =");
        int days = sc.nextInt();
        String dayName;
        switch (days){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "thursday";
                break;
            case 5:
                dayName = "friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day name =" +dayName);
    }
}
