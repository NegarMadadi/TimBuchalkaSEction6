package org.example.sec6.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount negarsAccount = new BankAccount();
        System.out.println(negarsAccount.getAccountNumber());
        System.out.println(negarsAccount.getBalance());

        negarsAccount.withraw(100);

        negarsAccount.deposit(50);
        negarsAccount.withraw(100);

        negarsAccount.deposit(51);
        negarsAccount.withraw(100);

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "1245");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withraw(100.55);
    }
}
