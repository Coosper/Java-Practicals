import java.util.Scanner;

public class Practica2Question9
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What year are you in?");
        int year = sc.nextInt();
        while(year<1 || year > 4)
        {
            System.out.println("Invalid year, please enter another year");
            year = sc.nextInt();
            System.out.println();

        
         
        }
        System.out.println("Best of luck next year!!");
    }
}