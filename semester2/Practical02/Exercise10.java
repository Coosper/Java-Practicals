import java.util.Scanner;
public class Exercise10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("*****Martial Status*****");
        System.out.println();
        System.out.println("1. Single (S, s)");
        System.out.println("2. Married (M, m)");
        System.out.println("3. Divorced (D, d)");
        System.out.println("4. Exit");
        System.out.print("Please enter your name: ");
        String name = sc.next();
        System.out.println();
        System.out.print("Please enter your martial status: ");
        char martial = sc.next().charAt(0);
        
        switch(martial)
        {
            case'S':case's':
            System.out.println("Hi " + name + " your martial status is single.");
            break;
            
            case'M':case'm':
            System.out.println("Hi " + name + " your martial status is married.");
            break;
            
            case'D':case'd':
            System.out.println("Hi " + name + " your martial status is divorced.");
            break;
            
            default:
            System.out.println("Sorry " + name + " you have entered an invalid response.");
        }
        }
    }
