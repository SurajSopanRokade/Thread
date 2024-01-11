package com.innerAssign;

public class Que5 {
//5. Show one example of method local inner class. Try to call method of inner class from main method.
	
	public void methodLocalInner(){
			class Inner{
				int a=10;
				int b=20;
				public void check() {
					System.out.println(a+b);
				}
			}
			Inner i = new Inner();
			i.check();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que5 q = new Que5();
		q.methodLocalInner();
		
	}

}
