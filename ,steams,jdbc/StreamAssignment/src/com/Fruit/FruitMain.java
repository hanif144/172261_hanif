package com.Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitMain {
	
	public static void main(String args[])
	{
		
List<Fruit> list=new ArrayList<>();
	    
	    list.add(new Fruit("Apple",50,100,"Red"));
	    list.add(new Fruit("PineApple",50,100,"Yellow"));
	    list.add(new Fruit("Banana",105,60,"Yellow"));
	    list.add(new Fruit("Blueberry",150,85,"Blue"));
	    list.add(new Fruit("Grapes",50,65,"Black"));
	    list.add(new Fruit("Pomegranate",90,100,"Red"));
	    
	    System.out.println("calories less than 100");
	   
	    List<String> list2=list.stream()
	    		.filter(p->p.getCalories()<100)
	    		.sorted(Comparator.comparing(Fruit::getCalories).reversed())
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list2.forEach(System.out::println);
	    
	    System.out.println("color of fruit names");
	    List<String> list3=list.stream()
	    		//.filter(p->p.getColor())
	    		.sorted(Comparator.comparing(Fruit::getColor))
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list3.forEach(System.out::println);
	    		
	    
	    System.out.println("red color fruits sorted as per order");
	    
	    List<String> list4=list.stream()
	    		.filter(p->p.getColor()=="Red")
	    		.sorted(Comparator.comparing(Fruit::getPrice))
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list4.forEach(System.out::println);
	    		
	 
	   
	    
		
	
	}

}
