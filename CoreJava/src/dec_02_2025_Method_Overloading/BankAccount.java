package dec_02_2025_Method_Overloading;
class BankAccount{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String IFSC_CODE="SBIHYD151285";
    BankAccount(String accountHolderName, String accountNumber, double balance){
        if(balance<=0){
            System.out.println("Balance cannot be negative.");
            System.exit(0);
        }
      this.accountHolderName=accountHolderName;
      this.accountNumber=accountNumber;
      this.balance=balance;
    }
    public void calculateInterest(){
        System.out.println("Generic Method");
    }
    public void displayAccountDetails(){
        System.out.println("Account Holder: "+this.accountHolderName);
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Balance RS :"+this.balance);
        System.out.println("IFSC CODE :"+this.IFSC_CODE);
    }
}
