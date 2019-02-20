package com.lambda5;

import java.util.List;
import java.util.ArrayList;

public class UpperCase {
	
	public static void main(String[] args) {
			List<String> array = new ArrayList<String>();
			array.add("haneef");
			array.add("rehan");
			array.add("pavan");
			array.add("sai");
			System.out.println("Names :\n"+array);
			System.out.println("**********************************");
			
			array.replaceAll(sai -> sai.toUpperCase());
			array.forEach(System.out::println);
		}

	}


