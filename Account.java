public interface Account 
{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

abstract class BankAccount implements Account
{
double balance;
public void deposit(double amount)
{
    balance=balance+amount;
   // System.out.println();
    //System.out.println("New Balance of your Account :"+balance);
}
public void withdraw(double amount)
{
    balance= balance-amount;
    System.out.println("New Balance :"+balance);
}
public double getBalance()
{
  return balance;
}
protected BankAccount(double balance)
{
    this.balance=balance;
}
}