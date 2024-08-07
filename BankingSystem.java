import java.util.Scanner;

class BankingSystem 
{
   public static void main(String[] args)
    {
        SavingAccount sa = new SavingAccount(50000.00);
        CheckingAccount ca = new CheckingAccount(50000.00);
        sa.addInterest();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 1: For deposit in the account");
        System.out.println("Enter 2: For withdraw the amount");
        int number = sc.nextInt();
        if(number==1)
        {
            System.out.println("Enter the deposit amount");
            int DA = sc.nextInt();
            sa.deposit(DA);
            System.out.println("After the deposit your amount in saving account is = "+sa.getBalance());
        }
        if(number==2)
        {
             System.out.println("Enter the withdraw amount");
             int WA = sc.nextInt();
             ca.withdraw(WA);
             System.out.println("After the withdraw your amount in saving account is = "+ca.getBalance());
        }
        sc.close();
    }
} 

