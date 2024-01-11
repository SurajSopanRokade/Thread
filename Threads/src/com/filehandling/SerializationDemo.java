package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String args[]) throws IOException, 
	ClassNotFoundException
	{
		
		//serialization process
		
		Student s1=new Student(100,"aaa",75f);
//		
		FileOutputStream fos=new FileOutputStream(".//src//student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(s1);
		System.out.println("Object Saved");
		
		//Deserialization process
		

		
		FileInputStream fis=new FileInputStream(".//student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		s1=(Student) ois.readObject();
		System.out.println("Object shown");
		System.out.println(s1);
		ois.close();
		fis.close();
		
	}
	
	
	

}
