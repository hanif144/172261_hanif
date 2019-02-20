package com.lambda7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertKeyString {
	
	
public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("hanif", 1);
		map.put("gayaz", 2);
		map.put("rehan", 3);
		map.put("prabhu", 4);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
