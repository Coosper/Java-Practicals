import java.util.Scanner;

public class Practical2Question7
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        int total = 0;
        
        for(int i = 1; i<=5;i++)
        {
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            
            total += num;
        }
        double average = total/2;
        
        System.out.println("The total of the 5 numbers entered is: " + total);
        System.out.println("The average of the 5 numbers entered is: " + average);
    }
}
