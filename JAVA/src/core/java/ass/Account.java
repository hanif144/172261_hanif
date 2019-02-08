package core.java.ass;
import java.util.*;

public class Account {
	
	private int id;
	private Customer1 customer;
	private double balance;
	public Account(int id, Customer1 customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public Account(int id, Customer1 customer) {
		super();
		this.id = id;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public Customer1 getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString()
	{
		return "ID:"+id+"Customer:"+customer+"Bal"+balance;
	}
	
	public void deposite()
	{
		double amount=600.00;
		balance=balance+amount;
		System.out.println("total balance is "+balance);
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		double am=sc.nextInt();
		if(balance>=am)
		{
			am=am-balance;
			System.out.println(balance);
		}
		else
		{
			System.out.println("amount withdrawn exceeds the balance");
		}
	}
}
