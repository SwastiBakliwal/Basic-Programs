class SavingAccount extends BankAccount
{
    protected SavingAccount(double balance)
    {
        super(balance);
    }
   final private double interestRate =0.05;
    void addInterest()
    {
     balance=(balance*interestRate/100)+balance;  
    }
  /*  public void deposit(double amount)
    {
      throw new UnsupportedOperationException("unimplemented method 'deposit'");
    } */ 
}
