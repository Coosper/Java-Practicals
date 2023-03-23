public class Question1
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("123456","Sean Murphy");
        BankAccount account2 = new BankAccount("987654", "Tom Doyle");
        
        //Printing out the details of account 1
        System.out.println("Account 1 Details");
        System.out.println("Account Number is " + account1.getAccountNumber());
        System.out.println("Account Name is " + account1.getAccountName());
        System.out.println("Account Balance is " + account1.getBalance());
        
        //A break.
        System.out.println();
        
        //Printing out the details of account 2
        System.out.println("Account 2 Details");
        System.out.println("Account Number is " + account2.getAccountNumber());
        System.out.println("Account Name is " + account2.getAccountName());
        System.out.println("Account Balance is " + account2.getBalance());
        
        System.out.println();
        
        //Depositing the set amount.
        account1.deposit(100.00);
        account2.deposit(200.00);
        
        //Printing out the details of account 1 again.
        System.out.println("Account 1 Details");
        System.out.println("Account Number is " + account1.getAccountNumber());
        System.out.println("Account Name is " + account1.getAccountName());
        System.out.println("Account Balance is " + account1.getBalance());
        
        //A break... again.
        System.out.println();
        
        //Printing out the details of account 2 again.
        System.out.println("Account 2 Details");
        System.out.println("Account Number is " + account2.getAccountNumber());
        System.out.println("Account Name is " + account2.getAccountName());
        System.out.println("Account Balance is " + account2.getBalance());
        
        System.out.println();
        
        //Withdrawing a set amount from both accounts.
        account1.withdraw(50);
        account2.withdraw(250);
        
        //Printing out the details of account 1 again, again.
        System.out.println("Account 1 Details");
        System.out.println("Account Number is " + account1.getAccountNumber());
        System.out.println("Account Name is " + account1.getAccountName());
        System.out.println("Account Balance is " + account1.getBalance());
        
        //A break... again, again.
        System.out.println();
        
        //Printing out the details of account 2 again, again.
        System.out.println("Account 2 Details");
        System.out.println("Account Number is " + account2.getAccountNumber());
        System.out.println("Account Name is " + account2.getAccountName());
        System.out.println("Account Balance is " + account2.getBalance());
        
        
        
        
        
    }
}
