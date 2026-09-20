import java.util.Scanner;
public class Triangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first side of the triangle  =  ");
        float a = sc.nextFloat();
        System.out.println("enter the  second side of the triangle = ");
        float b = sc.nextFloat();
        System.out.println("enter the third side of the triangle = ");
        float c = sc.nextFloat();
        float s = (a + b + c) / 2;
        double Area = Math.sqrt(s*(s - a)* (s - b)* (s - c));
        System.out.println("the area of the triangle is =" + Area);
    }
}