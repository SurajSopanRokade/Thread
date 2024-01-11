package com.thread;

public class WithoutSync implements Runnable {
	private Account a1;
	private Thread t1,t2;
	
	public WithoutSync() {
		// TODO Auto-generated constructor stub
		a1= new Account();
		t1= new Thread (this, "person1");
		t2= new Thread (this, "person2");
		
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutSync wo = new WithoutSync();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		doTransaction();
	}
	public void doTransaction() {
		System.out.println(Thread.currentThread().getName()+" is checking the balance = "+ a1.getBalance());
		a1.withdraw(4500);
	}

}
