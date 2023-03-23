import java.util.Scanner;

public class Practical2Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        while (true) {
            System.out.print("Please enter student name: ");
            String name = sc.nextLine();
            System.out.print("Please enter the student's address: ");
            String address = sc.nextLine();
            System.out.println("Please enter the student number: ");
            String snumber = sc.nextLine();
            System.out.println("Please enter the student's age: ");


            sc.nextLine();

            System.out.print("Do you wish to enter another student's details? (y/n)");
            answer = sc.nextLine();

            switch (answer) {
                case "y": case "Y":
                    break;
                case "n": case "N":
                    System.out.println("Understood, thank you for using my program!");
                    return;
                default:
                    System.out.println("Invalid answer! Try y/n");
            }
        }
    }
}