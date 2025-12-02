package dec_02_2025_Method_Overloading;
import java.util.Scanner;
public class Bank_Application{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1->{
                sc.nextLine();
                String accountHolderName=sc.nextLine();
                String accountNumber=sc.nextLine();
                double balance=sc.nextDouble();
                SavingAccount savingAccount=new SavingAccount(accountHolderName, accountNumber, balance);
                savingAccount.displayAccountDetails();
                savingAccount.calculateInterest();
            }
            case 2->{
                sc.nextLine();
                String accountHolderName=sc.nextLine();
                String accountNumber=sc.nextLine();
                double balance=sc.nextDouble();
                CurrentAccount currentAccount=new CurrentAccount(accountHolderName, accountNumber, balance);
                currentAccount.displayAccountDetails();
                currentAccount.checkOverdraftLimit();
            }
            case 3->{
                sc.nextLine();
                String accountHolderName=sc.nextLine();
                String accountNumber=sc.nextLine();
                double balance=sc.nextDouble();
                int depositeTerm=sc.nextInt();
                FixedDepositeAccount fixedDepositeAccount=new FixedDepositeAccount(accountHolderName, accountNumber, balance, depositeTerm);
                fixedDepositeAccount.displayAccountDetails();
                fixedDepositeAccount.calculateInterest();
                
            }
            default ->{
                System.out.println("Invalid Choice");
            }
        };
    }
}
