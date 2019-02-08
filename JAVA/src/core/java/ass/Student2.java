package core.java.ass;

public class Student2 extends Person {
	int sum=0;
	int count=0;
	
	private int numcourses;
		private String[] courses= {"java","python","c","c++"};
		private int[] grades= {1,3,4,5};
		
		public Student2(String name,String address)
		{
			super(name,address);
			this.numcourses=numcourses;
			
			
		}
		
		public void addCourseGrade(String course,String grade)
		{
			int i;
			for( i=0;i<courses.length;i++);
			{
				System.out.println("courses taken"+courses[i]);
				
			}
				
		}
		
		public void printGrades()
		{
			
			
			for(int i=0;i<grades.length;i++)
			{
				 sum=sum+grades[i];
				 count++;
				 System.out.println(grades[i]);
			}
		}
		
		public double getAverageGrades()
		{
			
			double avg= sum/count;
			System.out.println("average gradeis:"+avg);
			return avg;
		}
		
		public String toString()
		{
			return "NAME:"+name+"   "+"ADDRESS:"+address;
		}

		public void averageGrade() {
			// TODO Auto-generated method stub
			
		}

		
		
		
		
		
		

}
