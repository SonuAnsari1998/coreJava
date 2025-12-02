package dec_02_2025_Method_Overloading;

class FixedDepositeAccount extends BankAccount{
    protected double interestRate=6.5;
    protected int depositeTerm;
    FixedDepositeAccount(String accountHolderName, String accountNumber, double balance, int depositeTerm){
        super(accountHolderName, accountNumber, balance);
        if(depositeTerm<=0){
            System.out.println("Deposit term must be positive.");
            System.exit(0);
        }
        this.depositeTerm=depositeTerm;
    } 
    public void calculateInterest(){
        double inte=balance*depositeTerm*interestRate/100;
        System.out.println("Fixed Deposit Interest for "+depositeTerm+" years RS :"+inte);
    }
}
