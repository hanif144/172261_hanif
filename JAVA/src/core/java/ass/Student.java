package core.java.ass;

public class Student 
{
  private String name;
  protected static String address;
  private int numcourse;
  private String[] courses= {"java","php","C++"};
 private int[] grades= {60,50,70};

  
	
	public Student(String name,String address)
	{
		this.name=name;
		this.address=address;
	}


	public String getName() 
	{
		return name;
	}


	public String getAddress() 
	{
		return address;
	}


	public void setAddress(String address)
	{
		this.address = address;
	}
	
public String toString()
{
	return name+" "+address;
}

public void addCourseGrade()
{
	System.out.println("\n");
	for(int i=0;i<courses.length;i++)
	{
		System.out.println("Course::"+courses[i]+"   "+"Grade::"+grades[i]);
		
	}
}

public void printGrades()
{
	System.out.println("\n");
   System.out.println("NAME::"+name);
   for(int i=0;i<grades.length;i++)
   {
	   System.out.println("courses::"+courses[i]+"   "+"Grade::"+grades[i]);
   }
}

public void averageGrade()
{
  int sum=0,count=0;
  for(int i=0;i<grades.length;i++)
  {
	  sum=sum+grades[i];
	  count++;
  }
  System.out.println("\n");
  System.out.println("Average of All grades::"+sum/count);
	
}
}

