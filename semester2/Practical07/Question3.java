public class Question3
{
    public static void main(String[] args)
    {
        BankAccount [] accountList = new BankAccount[2];

        //Uses a for loop to create 3 BankAccount's in quick succession.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.print("Please enter the account number for account " + (i+1) + ": ");
            String num = EasyScanner.nextString();
            System.out.print("Please enter the account name for account " + (i+1) + ": ");
            String name = EasyScanner.nextString();
            accountList[i] = new BankAccount(num, name);
            System.out.println();
        }

        //Uses a for loop to display the details of the 2 bank accounts.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.println("Account " + (i+1) + " details.");
            System.out.println("Account Number is " + accountList[i].getAccountNumber());
            System.out.println("Account Name is " + accountList[i].getAccountName());
            System.out.println("Account Balance is " + accountList[i].getBalance());
            System.out.println();
        }

        //Uses a for loop to ask and deposit a specific amount into both accounts.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.print("How much would you like to deposit into account " + (i+1) + ": ");
            accountList[i].deposit(EasyScanner.nextInt());
            System.out.println();
        }

        //Uses a for loop to display the details of the 2 bank accounts... again.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.println("Account " + (i+1) + " details.");
            System.out.println("Account Number is " + accountList[i].getAccountNumber());
            System.out.println("Account Name is " + accountList[i].getAccountName());
            System.out.println("Account Balance is " + accountList[i].getBalance());
            System.out.println();
        }
        
        //Uses a for loop to ask and withdraw a specific amount from both accounts.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.print("How much would you like to withdraw from account " + (i+1) + ": ");
            accountList[i].withdraw(EasyScanner.nextInt());
            System.out.println();
        }
        
        //Displays the new account details for a third time.
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.println("Account " + (i+1) + " details.");
            System.out.println("Account Number is " + accountList[i].getAccountNumber());
            System.out.println("Account Name is " + accountList[i].getAccountName());
            System.out.println("Account Balance is " + accountList[i].getBalance());
            System.out.println();
        }
        
        
    }
}
