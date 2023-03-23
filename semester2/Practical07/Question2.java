public class Question2
{
    public static void main(String[] args)
    {
        //Creates an array of 3 BankAccount objects.
        BankAccount [] accountList = new BankAccount[3];
        
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
        
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.println("Account " + (i+1) + " details.");
            System.out.println("Account Number is " + accountList[i].getAccountNumber());
            System.out.println("Account Name is " + accountList[i].getAccountName());
            System.out.println("Account Balance is " + accountList[i].getBalance());
            System.out.println();
        }
        
        accountList[0].deposit(10);
        accountList[1].deposit(20);
        accountList[2].deposit(30);
        
        for(int i = 0; i < accountList.length; i++)
        {
            System.out.println("Account " + (i+1) + " details.");
            System.out.println("Account Number is " + accountList[i].getAccountNumber());
            System.out.println("Account Name is " + accountList[i].getAccountName());
            System.out.println("Account Balance is " + accountList[i].getBalance());
            System.out.println();
        }
        
        accountList[0].withdraw(5);
        accountList[1].withdraw(15);
        accountList[2].withdraw(40);
        
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
