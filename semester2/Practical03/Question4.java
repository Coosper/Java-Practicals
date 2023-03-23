import java.util.Scanner;

public class Question4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();
        area(radius);
        
    }
    
    public static void area(double radius) {
        double result = 3.1416 * radius * radius;
        System.out.println("The area of the circle is: " + result);
    }
}
