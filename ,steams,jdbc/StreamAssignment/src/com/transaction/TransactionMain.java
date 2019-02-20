package com.transaction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.trader.Trader;

public class TransactionMain {
	
	
	public static void main(String args[])
	{
		List<Transaction>list=new ArrayList<>();
		list.add(new Transaction(new Trader("haneef","andhra"),2011,32000));
		list.add(new Transaction(new Trader("nagaraj","tamilnadu"),2012,30000));
		list.add(new Transaction(new Trader("mia","mumbai"),2016,32530));
		list.add(new Transaction(new Trader("rehan","delhi"),2011,32100));
		list.add(new Transaction(new Trader("siddu","up"),2011,32200));
		
		List<Trader>list2=list.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).map(Transaction::getTrader).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("-------------------------------------------");



	}

}
