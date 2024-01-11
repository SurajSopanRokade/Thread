package com.filehandling;

import java.io.Serializable;

public class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rn;
	String name;
	float mark;
	public Student(int i, String string, float f) {
		// TODO Auto-generated constructor stub
		rn=i;
		name=string;
		mark=f;
		
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", mark=" + mark + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
