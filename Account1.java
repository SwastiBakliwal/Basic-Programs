package Sassignt;
interface Account1 
{
    
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

abstract class BankAccount1 implements Account1
{
double balance;
public void deposit(double amount)
{
    balance=balance+amount;
   // System.out.println("New Balance :"+balance);
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
protected BankAccount1(double balance)
{
    this.balance=balance;
}
}
    

