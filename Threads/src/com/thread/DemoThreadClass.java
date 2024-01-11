package com.thread;

public class DemoThreadClass extends Thread {
	public void run () {
		for(int i=1; i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " : " + currentThread().getName()+ " ");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoThreadClass t1=new DemoThreadClass();
		t1.setName("Thread-1");
		System.out.println(t1);
		//t1.setPriority(MAX_PRIORITY);
		t1.start();
//		t1.join();
		System.out.println(t1.isAlive());
		DemoThreadClass t2=new DemoThreadClass();
		t2.setName("Thread-2");
		//t2.setPriority(MIN_PRIORITY);
		System.out.println(t2);

		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	}

}
