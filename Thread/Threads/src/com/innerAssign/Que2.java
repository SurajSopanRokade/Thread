package com.innerAssign;

public class Que2 {
	//2. Create objects on static and non static inner classes in main method. Access methods ,variable of 
	//these classes in main method.
	//3. Create static and non static variables in both above inner classes.
	//4. Try to create static method in non-static inner class.
	
	public void check() {
		System.out.println("I am in non static inner1");
		
	}
	public class Inner1{
		
		private int a=10;
		public int b=12;
		static int c=14;
		static final int d=45;
		
		public static void checkstatic() {
			System.out.println("4. Try to create static method in non-static inner class.");
		}
		public void check() {
			System.out.println("I am in non static inner1");
			System.out.println(a+b+c+d);
		}
	}
	public static class Inner2{
		private int a=10;
		public int b=12;
		static int c=14;
		static final int d=45;
		public Inner2() {
			// TODO Auto-generated constructor stub
			
		}
		public void check() {
			System.out.println("I am in static inner2");
			System.out.println(a+b+c+d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que2 q1 = new Que2();
		Que2.Inner1 i1 = q1.new Inner1();
		i1.check();
		
		Que2.Inner2 i2 = new Inner2();
		i2.check();
		System.out.println(i2.b);
		
		Inner1.checkstatic();
	}

}
