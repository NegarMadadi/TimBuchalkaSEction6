package org.example.sec6;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this("135", 2.3,"Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount( String customerName, String email, String phoneNumber) {
        this("99999", 100, customerName,email,phoneNumber);

    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called.");
        setAccountNumber(accountNumber);
        setBalance(balance);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance is " + this.balance);
        } else {
            System.out.println("wrong input");
        }

    }

    public void withraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            System.out.println("Remaining balance is " + this.balance);
        } else if (amount < 0) {
            System.out.println("wrong input");
        } else if (amount > this.balance) {
            System.out.println("Insufficient fund.");
        }
    }
}
