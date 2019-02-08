package core.java.ass;
import java.util.ArrayList;
import java.util.Scanner;

public class Friends {

	public static void main(String args[])
	{
		PhoneBook a=new PhoneBook();
		a.addfname();
		a.addfcont();
		System.out.println("enter name which you wants search");
		Scanner kb=new Scanner(System.in);
		a.searchFre(kb.next());
		
		
		
	}
	
	

}
