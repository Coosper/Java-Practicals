
import java.util.Scanner;
public class Exercise5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        
        System.out.println("Maths Program");
        System.out.println();
        
        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();
        
        int numbersAdded = firstNumber + secondNumber;
        int numbersSubtracted = firstNumber - secondNumber;
        int numbersMultiplied = firstNumber * secondNumber;
        int numbersDivided = firstNumber/secondNumber;
        
        System.out.println();
        System.out.println("The result of numbers added is " + numbersAdded);
        System.out.println("The result of numbers subtracted is " + numbersSubtracted);
        System.out.println("The result of numbers multiplied is " + numbersMultiplied);
        System.out.println("The result of numbers divided is " + numbersDivided);
        
        
        
    }
}