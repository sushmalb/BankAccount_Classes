public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public  void depositMoney(double money){
        accountBalance+= money;
        System.out.println("Deposited Rs "+ money+" and new balance is Rs "+ accountBalance);
    }

    public  void withdrawMoney(double wMoney){
        if(accountBalance - wMoney< 0){
            System.out.println(" Insufficient Fund!!! You only have Rs "+ accountBalance + " in your account.");
        }else{
            accountBalance-= wMoney;
            System.out.println("Withdraw amount of:"+ wMoney +"Remaining balance is Rs "+ accountBalance);
        }
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }







}
