package com.lambda;

public class ClientTest {

	public static void main(String[] args) {
		int x=10,y=12;
		
		
MyInterfaceArithmetic myinterfacearithmetic = (int a,int b) -> (a+b);
MyInterfaceArithmetic myinterfacearithmetic1 = (int a,int b) -> (a-b);
MyInterfaceArithmetic myinterfacearithmetic2 = (int a,int b) -> (a*b);
MyInterfaceArithmetic myinterfacearithmetic3 = (int a,int b) -> (a/b);

int ans=myinterfacearithmetic.method(x,y);
System.out.println(ans);

int ans1=myinterfacearithmetic1.method(x,y);
System.out.println(ans1);

int ans2=myinterfacearithmetic2.method(x,y);
System.out.println(ans2);

int ans3=myinterfacearithmetic3.method(x,y);
System.out.println(ans3);




		
		
		
		
		

	}

}
