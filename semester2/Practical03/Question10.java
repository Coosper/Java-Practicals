import java.util.Scanner;

public class Question10
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        while(true) {
            System.out.println("***Calculator***");
            System.out.println("Select one of the following:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Please choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    System.out.println("Understood. Powering off...");
                    System.out.println();
                    return;
            }
        }
    }

    public static void addition()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = scn.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = scn.nextInt();

        int addition1 = number1 + number2;

        System.out.println("The sum of the two numbers is: " + addition1);
        System.out.println();
    }

    public static void subtraction()
    {
        Scanner scs = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = scs.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = scs.nextInt();

        int subtraction1 = number1 - number2;

        System.out.println(number1 + " taken from " + number2 + " is equal to: " + subtraction1);
        System.out.println();
    }

    public static void multiplication()
    {
        Scanner scs = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = scs.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = scs.nextInt();

        int multiplication1 = number1 * number2;

        System.out.println(number1 + " multiplied by " + number2 + " is equal to: " + multiplication1);
        System.out.println();
    }

    public static void division()
    {
        Scanner scs = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int number1 = scs.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = scs.nextInt();

        int division1 = number1 * number2;

        System.out.println(number1 + " divided by " + number2 + " is equal to: " + division1);
        System.out.println();
    }
}


