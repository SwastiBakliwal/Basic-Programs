package Sassignt;
import java.util.Scanner;

class BankingSystem1 
{
    static String name;
    static int Acnumber;
     public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your name :");
        name= sc.nextLine();
        System.out.println();
        System.out.print("Enter the account number :");
        Acnumber = sc.nextInt();
        System.out.println("enter the balance");
       Double balance= sc.nextDouble();
       SavingAccount1 sa = new SavingAccount1(balance);
        CurrentAccount1 ca = new CurrentAccount1(balance);
        sa.addInterest();
        System.out.println();
        System.out.println("Choose between CurrentAccount and SavingAccount for transactions :");
        System.out.println("Enter 1: To enter the CurrentAccount");
        System.out.println("Enter 2: To enter the SavingAccount");
        int number = sc.nextInt();
        if (number==1)
        { 
            System.out.println("Enter 1: For deposit in the account");
            System.out.println("Enter 2: For withdraw the amount");
            int num= sc.nextInt();
        
        if(num==1)
        {
            System.out.println("Enter the deposit amount");
            int DA = sc.nextInt();
            sa.deposit(DA);
            System.out.println("After the deposit amount in your account is = "+sa.getBalance());
        }
        if(num==2)
        {
             System.out.println("Enter the withdraw amount");
             int WA = sc.nextInt();
             ca.withdraw(WA);
             System.out.println("After the withdraw amount in your account is = "+ca.getBalance());
        }
        }
        if(number==2)
        {
            System.out.println("Enter 1: For deposit in the account");
            System.out.println("Enter 2: For withdraw the amount");
            int num= sc.nextInt();
            if(num==1)
        {
            System.out.println("Enter the deposit amount");
            int DA = sc.nextInt();
            sa.deposit(DA);
            System.out.println("After the deposit your amount in saving account is = "+sa.getBalance());
        }
        if(num==2)
        {
             System.out.println("Enter the withdraw amount");
             int WA = sc.nextInt();
             ca.withdraw(WA);
             System.out.println("After the withdraw your amount in saving account is = "+ca.getBalance());
        }
        }  
        sc.close();
    }
}
    
