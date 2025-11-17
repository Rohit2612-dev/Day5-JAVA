package org.ycpait.StudentManagementpp;
import org.ycpait.StudentManagementpp.entity.Student;
import org.ycpait.StudentManagementpp.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class StudentManagemenetApplication {

	public static void main(String[] args) {
		
			int choice = 0;
			System.out.println("Number of Students registered are :"+Student.getCount());
			//1. create a reference of Student type
			Student s=null;
//			int indexCount=0;
//			Student[] students = new Student[2];
			List<Student> students = new ArrayList<Student>();
			
			
//			System.out.println(students[0]);
//			System.out.println(students[1]);

			do {
				System.out.println("Welcome to Student Management App:");
				System.out.println("==================================");
				System.out.println("1. Register new Employee");
				System.out.println("2. Display Details");
				System.out.println("3. Enter Roll No");
				System.out.println("4. Delete By Roll No");
				System.out.println("5. Sort Student by Marks");
				System.out.println("6. Sort Student by Name");
				System.out.println("-1. Exit");
				System.out.println("Enter your choice:");
				Scanner sc=new Scanner(System.in);
				choice = sc.nextInt();
				
				switch (choice) {
				case 1: {
//					if(indexCount <= students.length)
//					{
//						students[indexCount] = new Student(1,"Amaan", 78.78f);
//						indexCount++;
//					}
//					else
//					{
//						System.err.println("Limit exceeded");
//					}
					System.out.println("Enter Name: ");
					String name = sc.next();
					System.out.println("Enter Marks: ");
					float marks = sc.nextFloat();
					Student s1 = new Student(name, marks);
					students.add(s1);
					break;
				}
				case 2: {
						//s.display();
						for(Student stu : students)
						{
							if(students!=null)
								System.out.println(stu);
						}
					break;
				}
				case 3:
					System.out.println("Enter Roll No: ");
					int r = sc.nextInt();
					boolean isFound = false;
					//Searching student in array
					
					for(Student foundStudent : students) {
						if (foundStudent != null) {
							if(foundStudent.getRollNo()  == r) {
								System.out.println("foundStudent");
								break;
							}
						}
					}
					if(!isFound) {
						StudentNotFoundException e = new StudentNotFoundException("Student with RollNo "+ r +" Not Found!");
						try {
							throw e;
						}
						catch(StudentNotFoundException ex){
							ex.printStackTrace();
							
						}
					}
				case 4:{
				    System.out.println("Enter Roll No to delete: ");
				    int rollToDelete = sc.nextInt();
				    Iterator<Student> i = students.iterator();
				    
//				    boolean isDeleted = false;
				    
				    while(i.hasNext()) {
				    	Student studentTobeDeleted = i.next();
				    	if(studentTobeDeleted.getRollNo() == rollToDelete)
				    	i.remove();
				    }
				}
				    break;	    
				
				case 5:
					Collections.sort(students);
					
					for(Student Stu : students) {
						if(Stu != null)
							System.out.println(Stu);
					}
					break;
					
				case 6:
					Collections.sort(students, (s1,s2)->s1.getName().compareTo(s2.getName()));
					
					for (Student Stu : students) {
						if(Stu != null)
							System.out.println(Stu);
					}
					break;
					
				case -1: {
					
					break;
				}
				default:
					System.out.println("Select correct choice");
					break;
				}
			}while(choice!=-1);
			System.out.println("Program Exit Successful");
		}
	}
