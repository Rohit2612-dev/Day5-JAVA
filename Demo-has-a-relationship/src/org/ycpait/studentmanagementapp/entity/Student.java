package org.ycpait.studentmanagementapp.entity;

public class Student {
	
	private String rollNo;
	
	//Has-a-relationship
	private Address postalAddress;
	
	private Trainer instructor;

	public Student(String rollNo, Address postalAddress) {
		super();
		this.rollNo = rollNo;
		this.postalAddress = postalAddress;
	}

//	public Trainer getInstructor() {
//		return instructor;
//	}

	public void setInstructor(Trainer instructor) {
		this.instructor = instructor;
	}
}
