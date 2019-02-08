package core.java.ass;

import java.util.Scanner;

public class Student1 extends Student
{

	

	public Student1(String name, String address) 
	{
         super(name , address);

	}

	public static void main(String[] args)
	{
   Student1 s=new Student1("haneef","1-5-28/1");
   System.out.println("NAME::"+s.getName());
   System.out.println("Address::"+s.getAddress());
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your address to set");
    address=sc.next();
    System.out.println("Setting Address is:"+address);
    
  
    s.addCourseGrade();
    s.printGrades();
    s.averageGrade();
    s.toString();
	}

}

