import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println();
        System.out.println("The larger number is: " + largestnum(number1,number2));
    }
    
    public static int largestnum(int number1, int number2) 
    {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
        }
    }

