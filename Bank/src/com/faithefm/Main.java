package com.faithefm;

public class Main {

    public static void main(String[] args) {
	Checking bobsAccount = new Checking();
	bobsAccount.withdrawal(100.00);

	bobsAccount.deposit(50.00);
	bobsAccount.withdrawal(100.00);

	bobsAccount.deposit(51.00);
	bobsAccount.withdrawal(100.00);

    }
}
