public class TestBankAccount
{
    public static void main(String [] args)
    {
        BankAccount account = new BankAccount(100); // This uses the default constructor.

        System.out.println(account);
        account.withdraw(25);

        System.out.println(account);
    }
}

class BankAccount {
    double balance;
    public BankAccount(double num){
        balance = num;
    }
    public void withdraw(double num){
        balance = balance - num;
    }
    public void deposit(double num){
        balance = balance + num;
    }
    public String toString(){
        return "The balance is " + balance;
    }
}