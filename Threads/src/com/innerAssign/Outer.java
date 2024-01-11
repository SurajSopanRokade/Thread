package com.innerAssign;

public class Outer {
	//1. Create class Outer in which you will have private , public , static and static final variables. Create 
	//static and non static inner class in ‘Outer’ class. Try to access all variables in both inner classes and 
	//check which are not accessible.
	private int a=10;
	public int b=12;
	static int c=14;
	static final int d=45;
	
	class Inner1{
		public Inner1() {
			// TODO Auto-generated constructor stub
			System.out.println("private : "+a);
			System.out.println("public : "+b);
			System.out.println("static : "+d);
			System.out.println("static final int : "+d);
		}
	}
	static class Inner2{
		public Inner2() {
			// TODO Auto-generated constructor stub
			//Cannot make a static reference to the non-static field b
//			System.out.println("private : "+a);
//			System.out.println("public : "+b);
			System.out.println("static : "+d);
			System.out.println("static final int : "+d);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner2 in = new Inner2();
		
		Outer.Inner1 inn = o.new Inner1();
	}

}
