
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;



public class GradeBookFileRunner
{
  public static void main( String args[] ) throws Exception
  {
		out.println("Welcome to the Class Stats program!");		
		Scanner file = new Scanner(new File("C:\\Users\\eppersonl1493\\Desktop\\APCSA\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\GradeBookFileRunner"));
		ArrayList<Class> classes = new ArrayList<Class>();
		String className = "";
		while(!file.hasNextInt()){
			className = className + file.next() + " ";
		}
		int classSize = file.nextInt();
		Class myClass = new Class(className, classSize);
		for(int i = 0; i < classSize; i++){
			String name = "";
			String gradesList = "";
			while(!file.hasNextInt()){
				name  = name + file.next() + " ";
			}
			
			while(file.hasNextInt() || file.hasNextDouble() || file.hasNext("-")){
				String test = file.next();
				gradesList = gradesList + test + " ";
			}
			Student newStudent = new Student(name, gradesList);
			myClass.addStudent(i,newStudent);			
		}
		myClass.sort();
		classes.add(myClass);
		System.out.println(myClass);
		out.println("Failure List = " + myClass.getFailureList(70));	
		out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());								
		out.println(String.format("Class Average = %.2f",myClass.getClassAverage()));
	}		
}
