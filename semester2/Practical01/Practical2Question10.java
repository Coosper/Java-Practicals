import java.util.Scanner;
public class Practical2Question10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What age are you?: ");
        int age = sc.nextInt();
        while(age > 1 || age < 100)
        {
            System.out.print("Invalid year, please try again: ");
            age = sc.nextInt();
            System.out.println();
    }
    System.out.println("Next year you will be " + (age+1) + " years old.");
}
}
