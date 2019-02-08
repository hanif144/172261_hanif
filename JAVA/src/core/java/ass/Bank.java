package core.java.ass;

public class Bank {
	public static void main(String args[])
	{
		Customer1 a=new Customer1(101,"haneef",'m');
		Account b=new Account(101,a,2000.00);
		System.out.println("**customer details***");
		System.out.println("ID IS "+a.getId());
		System.out.println("NAME IS:"+a.getName());
		System.out.println("GENDER:"+a.getGender());
		System.out.println(a.toString());
		System.out.println("\n");
		System.out.println("***account details***");
		
		System.out.println(b.getCustomer());
		System.out.println("ID"+b.getId());
		System.out.println("BALANCE"+b.getBalance());
		b.setBalance(4000);
		System.out.println(b.toString());
		b.deposite();
		b.withdraw();
		
	}

}
