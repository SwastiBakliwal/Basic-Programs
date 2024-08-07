import java.util.InputMismatchException;

class CheckingAccount extends BankAccount
{
    protected CheckingAccount(double balance)
    {
      super(balance);
    }
    public void withdraw(double amount)
    {
     if(balance<=amount)
     throw new InputMismatchException("Exceed the account limit");
     balance= balance-(amount+83);
    }
    public void deposit(double amount)
    {
      throw new UnsupportedOperationException("unimplemented method 'deposit'");
    }
}

