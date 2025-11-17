package org.ycpait.StudentManagementpp.entity;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student>{
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public static void setCount(int count) {
		Student.count = count;
	}


	private static int count;
	//Attributes
	private int rollNo;
	private String name;
	private float marks;
	
	//No-argument constructor
//	public Student(){
//		System.out.println("Constructor..");
//		this.rollNo=13;
//		this.name="Mamma";
//		this.marks=66.66f;	
//	}
	
//	Parameterized Constructor
	public Student(String name, float marks) {
//		System.out.println("Parameterized constructor 1:");
		count++;
		this.rollNo=count;
		this.name= name;
		this.marks= marks;	
		
	}
	
	
	public static int getCount() {
		return count;
	}
	
	
	void accept(int rollNo, String name, float marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;	
	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//method definition
	//Instance method
	void display() {
		System.out.println(this.rollNo);
		System.out.println(this.name);
		System.out.println(this.marks);
	}
	
	//Overloaded Method
	void display(String Format) {
		System.out.println("RollNo \t Name  \t Marks");
		for(int i=1; i<=40; i++) {	
			System.out.print(Format);
		}
			System.out.println();   //For new line
			
			System.out.println(this.rollNo +"\t   "+ this.name +"\t  "+ this.marks);
		}
	@Override
	public String toString()
	{
		System.out.println("in toString");
		return this.rollNo+"   \t   "+this.name+" \t   "+this.marks;
	}
	

	@Override
	public int compareTo(Student o) {
		
		return (int) (marks - o.marks);
	}


}
