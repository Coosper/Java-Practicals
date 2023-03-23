import java.util.Scanner;

/**
 * Gathering some details about your house, nothing sketchy.
 *
 * @author Kacper Marszelewski
 * @version 01/02/2023
 */
public class RoomsArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***Room Measurements!***");
        System.out.println();
        
        //Kitchen Measurements...
        System.out.print("Enter the length of your kitchen: ");
        double kitchenLength = sc.nextDouble();
        System.out.print("Enter the width of your kitchen: ");
        double kitchenWidth = sc.nextDouble();
        System.out.println();
        
        Rectangle kitchen = new Rectangle(kitchenLength,kitchenWidth);
        
        //Bedroom Measurements...
        System.out.print("Enter the length of your bedroom: ");
        double bedroomLength = sc.nextDouble();
        System.out.print("Enter the width of your bedroom: ");
        double bedroomWidth = sc.nextDouble();
        System.out.println();
        
        Rectangle bedroom = new Rectangle(bedroomLength,bedroomWidth);
        
        //Den Measurements...
        System.out.print("Enter the length of your den: ");
        double denLength = sc.nextDouble();
        System.out.print("Enter the width of your den: ");
        double denWidth = sc.nextDouble();
        System.out.println();
        
        Rectangle den = new Rectangle(denLength,denWidth);
        
        //Summary of room sizes...
        System.out.println("***Room length and width!***");
        System.out.println("The length of the kitchen is " + kitchen.getLength());
        System.out.println("The width of the kitchen is " + kitchen.getHeight());
        System.out.println();
        System.out.println("The length of the bedroom is " + bedroom.getLength());
        System.out.println("The width of the bedroom is " + bedroom.getHeight());
        System.out.println();
        System.out.println("The length of the den is " + den.getLength());
        System.out.println("The width of the den is " + den.getHeight());
        System.out.println();
        
        //Summary of room Areas...
        System.out.println("***Room area!!!***");
        System.out.println("The area of the kitchen is " + kitchen.calculateArea());
        System.out.println("The area of the bedroom is " + bedroom.calculateArea());
        System.out.println("The area of the den is " + den.calculateArea());
        System.out.println();
        
        //Summary of room perimeters...
        System.out.println("***Room perimeter!!***");
        System.out.println("The perimeter of the kitchen is " + kitchen.calculatePerimeter());
        System.out.println("The perimeter of the bedroom is " + bedroom.calculatePerimeter());
        System.out.println("The perimeter of the den is " + den.calculatePerimeter());
        System.out.println();
        
        //Finale
        System.out.println("The end...");
        System.out.println("The total area of all the rooms is " + (kitchen.calculateArea()+bedroom.calculateArea()+den.calculateArea()));
        System.out.println("The total perimeter of all the rooms is " + (kitchen.calculatePerimeter()+bedroom.calculatePerimeter()+den.calculatePerimeter()));
        
        
        
        
        
    }
}
