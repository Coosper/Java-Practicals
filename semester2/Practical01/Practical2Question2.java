import java.util.Scanner;

public class Practical2Question2
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String name;
      
      System.out.print("Please enter your name: ");
      name = sc.nextLine();
      
      for(int i = 1; i<=50; i++)
      {
          System.out.println(name);
      }
    }
}
