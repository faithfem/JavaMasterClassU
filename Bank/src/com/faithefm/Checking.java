package com.faithefm;

public class Checking {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String customerPhoneNumber;

    //Create methods to Deposit and Withdraw funds
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount);
    }

    public void withdrawal(double withdrawalAmount) {
        if ( this.balance - withdrawalAmount <=0){
        System.out.println("Only " + this.balance + " available. Withdrawal not processed");
    } else{
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    }

    }

    public String getAccountNumber() {
        return number;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
