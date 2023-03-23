import java.util.Scanner;

public class Practical2Question12
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String answer = "1";
        double balance = 500.00;
        
        while (true) {
        System.out.println("Bank Online");
        System.out.println();
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit" );
        System.out.println("3. Balance" );
        System.out.println("4. Exit" );
        System.out.println();
        System.out.print("Enter your choice: ");
        System.out.println();
        int choice = sc.nextInt(); 
        
        switch (choice) {
                case 1:
                    System.out.print("Please enter the amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (balance >= amount) {
                        balance -= amount;
                        System.out.println("Withdrawal successful. New balance is " + balance);
                        System.out.println();
                    } else {
                        System.out.println("Insufficient funds.");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
    }
}
}
}
