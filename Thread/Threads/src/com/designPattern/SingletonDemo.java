package com.designPattern;

public class SingletonDemo {
	// Java program implementing Singleton class
		// with getInstance() method

		// static variable single_instance of type Singleton
		private static SingletonDemo single_instance ; //early

		// variable of type String
		public String s;
		

		// private constructor restricted to this class itself
		private SingletonDemo() 
		{
			s = "Hello I am a string part of Singleton class";
		}

		// static method to create instance of Singleton class
		public static SingletonDemo getInstance() 
		{
			if (single_instance == null)
				single_instance = new SingletonDemo();   ///lazy initialization
			return single_instance;
		}
	

}
