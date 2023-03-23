import java.util.Scanner;

/**
 * One More Triangle
 *
 * @author Kacper Marszelewski
 * @version 01/02/2023
 */
public class OneMoreRectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***Enter Rectangle Information***");
        System.out.println();
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println();
        
        Rectangle myRectangle = new Rectangle(length,width);
        
        System.out.println("***Rectangle Information***");
        System.out.println("The length of the rectangle is: " + myRectangle.getLength());
        System.out.println("The width of the rectangle is: " + myRectangle.getHeight());
        System.out.println("The area of the rectangle is: " + myRectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + myRectangle.calculatePerimeter());
        
        
    }
}
