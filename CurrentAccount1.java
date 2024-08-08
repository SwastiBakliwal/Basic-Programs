package Sassignt;

import java.util.InputMismatchException;

class CurrentAccount1 extends BankAccount1
{
    protected CurrentAccount1(double balance)
    {
     super(balance);
    }
    public void withdraw(double amount)
    {
     if(balance<=amount)
     throw new InputMismatchException("Exceed the account limit");
     balance= balance-(amount+83);    
    }
    final private double interestRate =0.05;
    void addInterest()
    {
     balance=(balance*interestRate/100)+balance;  
    }
}

