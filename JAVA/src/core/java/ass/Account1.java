package core.java.ass;

import java.util.Scanner;

public class Account1
{ 
	private int id;
	private String name;
	private float balance;
	

	Account1(int id, String name,float balance) 
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}


public int getId() {
	return id;
}

public String getName() {
	return name;
}

public float getBalance() {
	return balance;
}


public void credit(int cr)
{
	int amount;
	amount=(int) (cr+balance);
	System.out.println("Total Amount After credit="+amount);
	System.out.println("\n");
	
	
}
public void debit(int db)
{
	int amount1 = 0;
	if(db<balance)
	{
		amount1=(int) (balance-db);
		System.out.println("After debit="+amount1);
		System.out.println("\n");
	}
	else
	{
		System.out.println("Amount Exceeded balance");
		System.out.println("\n");
	}
	
}
public void tranferTo(int amnt)
{
	int anotheraccnt;
	if(amnt<=balance)
	{
		System.out.println("Amount transfored successfully");
		balance=balance-amnt;
		System.out.println("After Transforing Total Money="+balance);
		System.out.println("\n");
	}
	else
	{
		System.out.println("Amount Exceeded Balance");
		System.out.println("\n");
	}
}
public String toString()
{
	return "ID is::"+id+" "+"NAME is::"+name+" "+"BALANCE IS"+balance;
	
}

}
