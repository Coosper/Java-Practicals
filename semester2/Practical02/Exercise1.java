
/**
 * A program that accepts 2 variables, 
 * the name and address then prints them back out.
 * 
 *
 *
 * @author Kacper Marszelewski
 * @version 20/01/2023
 */

import java.util.Scanner;
public class Exercise1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String address;
        
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your address: ");
        address = sc.next();
        
        System.out.println();
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
        
        
        
    }
}
