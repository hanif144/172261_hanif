package com.transaction;

import com.trader.Trader;

public class Transaction {
	
	private Trader trader;
	private int year;
	private int value;
	public Transaction(Trader trader, Integer year, Integer value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public Integer getValue() {
		return value;
	}
	
	

}
