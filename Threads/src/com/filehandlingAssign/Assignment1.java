package com.filehandlingAssign;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.filehandling.Student;

public class Assignment1 {
	FileInputStream fin = null;
	FileOutputStream fout = null;
	BufferedInputStream bin = null;
	BufferedOutputStream bout = null;

	public void createDirectory(String str) {
		File f1 = new File(str);
		System.out.println(f1.mkdir());
	}

	public void createTextFile(String str) throws IOException {
		// 1. Write code to create a file.
		File f1 = new File(str);
		System.out.println(f1.createNewFile());
	}

	public void writeContentInTextFile(String str) throws IOException {
		// 2. Write a Java code to write content into the file.
		File f = new File(str);
		fout = new FileOutputStream(f);
		bout = new BufferedOutputStream(fout);

		System.out.println("Enter some data....");
		int data = System.in.read();
		while (data != 45) {
			bout.write(data);
			bout.flush();
			data = System.in.read();
		}
		System.out.println("Contaient written to file....");
	}

	public void readContentTextFile(String str) throws IOException {
		// 3. Write a code to Read the File on console.
		File f1 = new File(str);
		fin = new FileInputStream(f1);
		bin = new BufferedInputStream(fin);
		System.out.println("Containts form files are ....");
		int a = System.in.read();
		while (a != -1) {
			System.out.println((char) a);
			a = bin.read();
		}
	}

	public void copyOneContentIntoAnother(String source, String dest) throws IOException {
		// 4. Write a code to copy one file content into another file.
		fin = new FileInputStream(source);
		fout = new FileOutputStream(dest, true);
		int data = fin.read();
		while (data != -1) {
			fout.write(data);
			fout.flush();
			data = fin.read();
		}
		System.out.println("Containt transfered");
	}

	public void displayFileDetails(String str) {
		// 5. Write code to display file details.
		File f1 = new File(str);
		System.out.println("File name : " + f1.getName());
		System.out.println("Absolute path : " + f1.getAbsolutePath());
		System.out.println("It can read : " + f1.canRead());
		System.out.println("It can write : " + f1.canWrite());
		System.out.println("length : " + f1.length());
	}

	public void deleteFile(String str) {
		// 6. Write code to delete file.
		File f1 = new File(str);
		System.out.println(f1.delete());
	}

	public void performSerialization(String str) throws IOException {
		// 7. Write code to perform serialization to write Any Object into the file.
		System.out.println("Give me an object on which Serialization want");
		Student s2 = new Student(100, "aaa", 75f);
		FileOutputStream fout = new FileOutputStream(str);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(s2);
		oos.flush();
		oos.close();
		fout.close();
		System.out.println(s2);
		System.out.println("Object saved ....");
	}

	public void deserialization(String str) throws ClassNotFoundException, IOException {
		// 8. Write code to perform to deserialization.
		Student s2 = new Student(100, "aaa", 75f);
		FileInputStream fis = new FileInputStream(str);
		ObjectInputStream ois = new ObjectInputStream(fis);
		s2 = (Student) ois.readObject();
		System.out.println("Object shown");
		System.out.println(s2);
		ois.close();
		fis.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Assignment1 a1 = new Assignment1();

		a1.createDirectory("D:\\filehandling");
		a1.createTextFile("D:\\filehandling\\Suraj2.txt");
		a1.writeContentInTextFile("D:\\filehandling\\Suraj2.txt");
		a1.deleteFile(null);
		a1.readContentTextFile("D:\\filehandling\\Suraj2.txt");
		a1.copyOneContentIntoAnother(null, null);
		a1.displayFileDetails(null);
		a1.performSerialization(null);
		a1.deserialization(null);
	}

}
