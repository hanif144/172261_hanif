package com.lambda6;

import java.util.List;
import java.util.ArrayList;

public class FirstString {
	
	
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("haneef");
		array.add("rehan");
		array.add("deepak");
		array.add("hon");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
	
		String result = array.stream().map(s -> Character.toString(s.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}

}
