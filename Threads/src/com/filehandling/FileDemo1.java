package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File ff = new File("D:\\Dp8 Java\\Mock");
//		System.out.println("File Name :"+ff.getName());
//		System.out.println("Path :"+ff.getPath());
//		System.out.println("Abs path :"+ff.getAbsolutePath());
//		System.out.println("Parent :"+ff.getParent());
//		System.out.println(ff.exists()?"exists":"not exists");
//		System.out.println(ff.canWrite()?"is writable":"its not writable");
//		System.out.println(ff.canRead()?"readable":"its not readable");
//		System.out.println(ff.isDirectory()?"is directory":"its not directory");
//		System.out.println(ff.isFile()?"is file":"its not file");
//		System.out.println(ff.isAbsolute()?"is absolute":"its not absolute");
//		System.out.println("File last modified :"+ff.lastModified());
//		System.out.println("File size :"+ff.length());
		// create file 
		
		File ff1 = new File("D:\\Suraj");
	//	System.out.println(ff1.mkdir());
		File ff2 = new File("D:\\Suraj\\Rokade.pdf");
	//	System.out.println(ff2.createNewFile());
	//	System.out.println(ff1.exists());
	//	System.out.println(ff1.isAbsolute());
	//	System.out.println(ff2.length());
		System.out.println(ff2.canRead());
	//	ff2.delete();
	}

}
