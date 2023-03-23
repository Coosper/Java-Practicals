import java.util.Scanner;

public class Practical2Question6
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)
        {
            Scanner sc = new Scanner(System.in);
            int number;
            
            System.out.print("Please enter a number: ");
            number = sc.nextInt();
            
            System.out.println("The number you have entered is: " + number);
        }
    }
}
