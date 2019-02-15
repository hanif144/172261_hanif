package collection.service;

import java.util.TreeSet;

public class BankAccountList {
	
	TreeSet<SavingAccount> t;

	public BankAccountList() {
		super();
		t=new TreeSet<SavingAccount>();
	}
	
	
	public void addAccount(SavingAccount account)
	{
		t.add(account);
	}
	
	public void removeAccount(SavingAccount account)
	{
		t.remove(account);
		
	}
	
	public TreeSet<SavingAccount> getAccounts()
	{
		return t;
	}
	
	
	


	
	
	

}
