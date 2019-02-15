package collection.test;

import java.util.TreeSet;

import java.util.Iterator;

import collection.service.BankAccountList;
import collection.service.SavingAccount;

public class BankAccountTest {
	
	public static void main(String args[])
	{
		BankAccountList a = new BankAccountList();
		
		
		
		SavingAccount a1=new SavingAccount(1000.00,101,"haneef",true);
		
		SavingAccount a2=new SavingAccount(2000.00,102,"rehan",true);
		
		SavingAccount a3=new SavingAccount(3000.00,103,"shahid",true);
		SavingAccount a4=new SavingAccount(4000.00,104,"nagaraj",true);
		
		
		a1.deposite(5000);
		a2.withDraw(2000);
		
		a.addAccount(a1);
		a.addAccount(a2);
		a.addAccount(a3);
		a.addAccount(a4);
		
		TreeSet<SavingAccount> t = a.getAccounts();
		
		Iterator<SavingAccount> it=t.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		



		
	}

}
