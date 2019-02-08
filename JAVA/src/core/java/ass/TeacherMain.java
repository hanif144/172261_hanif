package core.java.ass;
import java.util.Scanner;

public class TeacherMain
{

	public static void main(String[] args) 
	{
		Teacher t=new Teacher("haneef","ARMUR");	
		Student2 s=new Student2("rehan","NIZAMABAD");
		Person p=new Person("Prasadh","Karimnagar");
		System.out.println("PERSON CLASS DETAILS");
		System.out.println("NAME::"+p.getName());
		System.out.println("ADDRESS::"+p.getAddress());
		System.out.println(p.toString());
	System.out.println("\n");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Teacher Course");
	String course=sc.next();
	System.out.println(t.addcourse(course));
	System.out.println("\n");
	System.out.println("Enter A course to remove");
	String course1=sc.next();
	System.out.println(t.removecourse(course1));
	System.out.println(t.toString());
s.addCourseGrade(course, course1);
s.printGrades();
s.averageGrade();
	
	}

}

