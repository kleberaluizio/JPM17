public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

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

    public int getCustomerPhone() {
        return customerPhone;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.customerPhone = phoneNumber;
    }

    //Other Methods

    public void depositFunds(double depositValue){
        this.accountBalance += depositValue;
        System.out.println("Deposit of $ " +depositValue+". New account balance is $" + this.accountBalance);
    }
    public void withdrawFunds(double withdrawValue){

        if ((this.accountBalance - withdrawValue) < 0){
            System.out.println("Insufficient funds!You only have $ "+this.accountBalance + " in your account.");
        }else {
            this.accountBalance -= withdrawValue;
            System.out.println("Withdrawal of $ " +withdrawValue+" processed. New account balance is " + this.accountBalance);
        }
    }
}
