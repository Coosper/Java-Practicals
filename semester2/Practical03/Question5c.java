import java.util.Scanner;

public class Question5c
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println();
        System.out.println("Is the first number larger than the second: " + largestnum(number1,number2));
    }

    public static boolean largestnum(int number1, int number2) 
    {
        return number1 > number2;
    }
}

