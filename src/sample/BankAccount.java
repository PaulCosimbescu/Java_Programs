package sample;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Deposit made of " + funds + " made. New balance is "+ this.balance);
    }

    public void withdrawFunds(double funds) {
        if(this.balance < funds) {
            System.out.println("Only " + this.balance + " available. Withdraw not processed.");
        } else {
            this.balance -= funds;
            System.out.println("Withdraw of " + funds + " processed. Balance remaining of " + this.balance);
        }
    }
}
