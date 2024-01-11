package com.thread;

public class Account {
	private long balance=5000;
	public long getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("The amount is withdrawn by "+Thread.currentThread().getName());
		}
		else
			System.out.println(Thread.currentThread().getName()+" Insufficient balance ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
