package com.lamda4;


import java.util.ArrayList;

public class WordMain {

	public static void main(String[] args) {
		
		
		ArrayList<String> str1=new ArrayList<String>();
		
		str1.add("haneef");
		str1.add("rehan");
		str1.add("elu");
		

			
			str1.removeIf(e->e.length()%2==0);
			
			str1.forEach(System.out::println);
		
	}
	

}
