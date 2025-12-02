package dec_02_2025_Method_Overloading;
class CurrentAccount extends BankAccount{
    protected double overdraftLimit=5000.0;
    CurrentAccount(String accountHolderName, String accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
    }
    public void calculateInterest(){
        System.out.println("Current Account");
    }
    public void checkOverdraftLimit(){
        System.out.println("Current accounts do not earn interest.");
        System.out.println("Overdraft limit RS :"+overdraftLimit);
    }
}
