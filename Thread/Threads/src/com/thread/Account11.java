package com.thread;

public class Account11 {
	public static long balance = 5000;
	

	public long getBalance()
	{
		return balance;
	}

	public void withDraw(int amount)
	{
		
		if(balance > amount)
		{
			balance = balance - amount;
			System.out.println("The amount is withdrawn by  " + Thread.currentThread().getName());
		}
		else
			System.out.println(Thread.currentThread().getName() + " : Insufficient amount");
	}
	public void deposit(int rupees)
	{
		balance=balance+rupees;
		System.out.println("The amount is deposited by  " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
