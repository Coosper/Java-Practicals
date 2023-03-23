import java.util.Scanner;

public class Question5b
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Please enter the third number: ");
        int number3 = sc.nextInt();

        System.out.println();
        System.out.println("The larger number is: " + largestnum(number1,number2,number3));
    }

    public static int largestnum(int number1, int number2, int number3) 
    {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }  
    }
}