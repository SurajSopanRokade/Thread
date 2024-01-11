package com.simpleinnerclass;

public class Outer {
	int outer_n;
	int data=100;
	
	public Outer() {
		// TODO Auto-generated constructor stub
		outer_n=10;
	}
	
	public Outer(int outer_n) {
		super();
		this.outer_n = outer_n;
	}
	public void showOuterData() {
		System.out.println("Outer class data is : "+outer_n);
		Inner in = new Inner();
		System.out.println(in.data);
	}
	class Inner{
		int inner_n;
		int data=999;
		public Inner() {
			// TODO Auto-generated constructor stub
			inner_n=15;
		}
		public Inner(int inner_n) {
			this.inner_n=inner_n;
		}
		public void showInnerData() {
			System.out.println("Inner class data is : "+inner_n);
			System.out.println("Outer data form inner class method : "+outer_n);
			System.out.println(this.data);
			System.out.println(Outer.this.data);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		//1
		o.showOuterData();
		Outer.Inner in = o.new Inner();
		in.showInnerData();
		//2
		/*
		 *   OuterClassName.InnerClassname variable=new OuterClassName().new InnerClassName();
		 * 
		 * */
		Outer.Inner inn = new Outer().new Inner();
	}

}
