public class Question4
{
    public static void main(String[] args)
    {
        BankAccount [] accountList = new BankAccount[2];
        double amount;

        //Uses a for loop to create 2 BankAccount's in quick succession.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.print("Please enter the account number for account " + (i+1) + ": ");
            String num = EasyScanner.nextString();
            System.out.print("Please enter the account name for account " + (i+1) + ": ");
            String name = EasyScanner.nextString();
            accountList[i] = new BankAccount(num, name);
            System.out.println();
        }

        System.out.println("Bank Details");
        System.out.println();
        System.out.print("Which bank account would you like to update?: ");
        int accountChoice = EasyScanner.nextInt();

        System.out.println();

        if (accountChoice == 1) {
            System.out.println("Would you like to deposit or withdraw from Account 1?");
            System.out.print("Enter w/W for withdraw or d/D for deposit: ");
            String choice1 = EasyScanner.nextString();

            switch (choice1) {
                case "w": case "W":
                    System.out.print("Enter the amount to withdraw from the account 1: ");
                    amount = EasyScanner.nextDouble();
                    accountList[0].withdraw(amount);
                    System.out.println();
                    System.out.println("Account details after transaction.");
                    System.out.println();
                    System.out.println("Account Number: " + accountList[0].getAccountNumber());
                    System.out.println("Account Name: " + accountList[0].getAccountName());
                    System.out.println("Account Balance: " + accountList[0].getBalance());
                    break;

                case "d": case "D":
                    System.out.print("Enter the amount to deposit into account 1: ");
                    amount = EasyScanner.nextDouble();
                    accountList[0].deposit(amount);
                    System.out.println();
                    System.out.println("Account details after transaction.");
                    System.out.println();
                    System.out.println("Account Number: " + accountList[0].getAccountNumber());
                    System.out.println("Account Name: " + accountList[0].getAccountName());
                    System.out.println("Account Balance: " + accountList[0].getBalance());
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid Transaction Type!");
                    break;

            }

        } else if (accountChoice == 2) {
            System.out.println("Would you like to deposit or withdraw from Account 2?");
            System.out.print("Enter w/W for withdraw or d/D for deposit: ");
            String choice1 = EasyScanner.nextString();

            switch (choice1) {
                case "w": case "W":
                    System.out.print("Enter the amount to withdraw from the account 2: ");
                    amount = EasyScanner.nextDouble();
                    accountList[1].withdraw(amount);
                    System.out.println();
                    System.out.println("Account details after transaction.");
                    System.out.println();
                    System.out.println("Account Number: " + accountList[1].getAccountNumber());
                    System.out.println("Account Name: " + accountList[1].getAccountName());
                    System.out.println("Account Balance: " + accountList[1].getBalance());
                    break;

                case "d": case "D":
                    System.out.print("Enter the amount to deposit into account 2: ");
                    amount = EasyScanner.nextDouble();
                    accountList[1].deposit(amount);
                    System.out.println();
                    System.out.println("Account details after transaction.");
                    System.out.println();
                    System.out.println("Account Number: " + accountList[1].getAccountNumber());
                    System.out.println("Account Name: " + accountList[1].getAccountName());
                    System.out.println("Account Balance: " + accountList[1].getBalance());
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid Transaction Type!");
                    break;
            }
            } else {
                System.out.println();
                System.out.println("Invalid choice!");
            }
        }
    }
