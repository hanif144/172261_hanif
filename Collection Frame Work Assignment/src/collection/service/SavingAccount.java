package collection.service;

public class SavingAccount implements Comparable<SavingAccount> {
	
	private double acc_balance;
	private int acc_id;
	private String account_Holdername;
	private boolean isSalaryAccount;
	public SavingAccount(double acc_balance, int acc_id, String account_Holdername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.account_Holdername = account_Holdername;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccount_Holdername() {
		return account_Holdername;
	}
	public void setAccount_Holdername(String account_Holdername) {
		this.account_Holdername = account_Holdername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double withDraw(double amount)
	{
		if(amount<acc_balance)
		{
			amount=amount-acc_balance;
		}
		else
		{
			System.out.println("amount exceeded");
		}
		
		return acc_balance;
	}
	
	public double deposite(double amount)
	{
		acc_balance=amount+acc_balance;
		return acc_balance;
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", account_Holdername="
				+ account_Holdername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	@Override
	public int compareTo(SavingAccount arg0) {
		
		if(acc_id>arg0.getAcc_id())
			return 1;
		if(acc_id<arg0.getAcc_id())
			return -1;
		
		return 0;
	}
	
	

	
	
	

}
