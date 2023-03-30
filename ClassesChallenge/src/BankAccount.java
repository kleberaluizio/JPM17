public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Constructor
    public BankAccount(){
        this("56789",2.5,"Default name","Default address", "Default phone");
        System.out.println("Empty constructor called!");
    }
    // This calls another construct within the constructor. Always in first line.
    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Account constructor with parameters called!");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("9999",100.55,customerName,customerEmail,customerPhone);
    }

    // To string

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber = " + accountNumber +
                ", accountBalance = " + accountBalance +
                ", customerName = '" + customerName + '\'' +
                ", email = '" + customerEmail + '\'' +
                ", phoneNumber = " + customerPhone +
                '}';
    }

    //Getters and Setters
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.customerPhone = phoneNumber;
    }

    //Other Methods

    public void depositFunds(double depositValue){
        this.accountBalance += depositValue;
        System.out.println("Deposit of $ " +depositValue+". New account balance is $" + this.accountBalance);
    }
    public void withdrawFunds(double withdrawValue){

        if ((this.accountBalance - withdrawValue) < 0){
            System.out.println("Insufficient funds!You're not able to withdraw "+withdrawValue+" because you only have $ "+this.accountBalance + " in your account.");
        }else {
            this.accountBalance -= withdrawValue;
            System.out.println("Withdrawal of $ " +withdrawValue+" processed. New account balance is " + this.accountBalance);
        }
    }
}
