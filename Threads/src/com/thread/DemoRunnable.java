package com.thread;

public class DemoRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t = new DemoRunnable();
		Thread t1 = new Thread(t,"ping");
		t1.start();
		Thread t2 = new Thread(new DemoRunnable(), "pong");
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " : " + Thread.currentThread().getName()+ " ");
		}
	}

}
