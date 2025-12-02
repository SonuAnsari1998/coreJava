package dec_02_2025_Method_Overloading;
class SavingAccount extends BankAccount{
    protected double interestRate=4.0;
    SavingAccount(String accountHolderName, String accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
    }
    public void calculateInterest(){
        double interest=(interestRate*balance)/100;
        System.out.println("Savings Account Interest RS :"+interest);
    }
}
