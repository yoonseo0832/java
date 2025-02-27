package com.kh.object.ex1;

public class BankAccount {
		int balance =0;
		
		public void deposit(int money) {
			balance+=money;
		}
		public int withdraw(int money) {
			balance-=money;
			return balance;
		}
		public void check() {
			System.out.println("잔액 : " + balance);
		}

}
