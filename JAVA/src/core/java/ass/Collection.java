package core.java.ass;
import java.util.*;

public class Collection {
	
	public static void main(String args[])
	{
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(3);
		al.add(0,2);
		al.add(5);
		
		System.out.println(al);
		
		ArrayList<String> a2=new ArrayList<String>();
		
		a2.add("haneef");
		a2.add(0,"gayaz");
		System.out.println(a2);
		
		Iterator it=al.iterator();
		
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
