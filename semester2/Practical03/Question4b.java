import java.util.Scanner;

public class Question4b
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("The area of the circle is: " + area(radius));
    }
    
    public static double area(double radius) {
        return 3.1416 * radius * radius;
    }
}