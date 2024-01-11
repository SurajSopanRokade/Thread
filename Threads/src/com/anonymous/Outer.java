package com.anonymous;

public class Outer {
	Demo d = new Demo() {
		// A.I.C subclass of Demo
		int ai = 20;
		{
			System.out.println("In instance init block ");
		}

		public void show() {
			super.show();
			System.out.println("In AIC show " + ai);
			newMethodAIC();
		}

		public void newMethodAIC() {
			System.out.println("in new method ");
		}

	};
	Myinterface ii = new Myinterface() {

		// A.I.C type Interface implementor
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("This is test of A.I.C");

		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		// o.d.show();
		o.ii.test();
	}

	class Demo {
		int data = 10;

		public Demo() {
			// TODO Auto-generated constructor stub
		}

		public void show() {
			System.out.println("From Demo class show " + data);
		}
	}

	interface Myinterface {
		public void test();
		// public void check();

	}
}
