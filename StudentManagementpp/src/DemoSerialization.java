import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.ycpait.StudentManagementpp.entity.Student;

public class DemoSerialization {

	public static void main(String[] args) 
	{
	   FileOutputStream fos=null;
	   ObjectOutputStream oos=null;
	   try 
	{
		fos=new FileOutputStream("students.txt");
		oos=new ObjectOutputStream(fos);
		
		Student s=new Student("Rohit",42);
		oos.writeObject(s);
	} catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}