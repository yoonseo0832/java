package com.kh.object.ex1;

public class Run {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		account.check();
		account.withdraw(4000);
		
		
		BankAccount account2 = account;
		account2.deposit(50000);
		account.check();
		account2.check();
	}

}
