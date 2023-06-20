package oops;

import java.util.Scanner;

interface Bank12
{
	public void showdetails();
	public void balance();
	public void deposit();
	public void withdraw();	
}
class SBI11 implements Bank1
{
String name="Ajish chacko";
static String Bankname="SBI";
int balance=10000;
int  accountno;
Scanner sc=new Scanner(System.in);
	public void showdetails() {
		System.out.println("enter the AccountNumber");
		accountno=sc.nextInt();
		System.out.println("Accountno  ="+accountno);
		System.out.println("Accountname   ="+name);
		System.out.println("Bankname   ="+Bankname);
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance  ="+balance);
	}

	@Override
	public void deposit() {
		System.out.println("Enter the Despositing Amount");
		int d=sc.nextInt();
		balance=balance+d;
		System.out.println("Balance after Deposit  ="+balance);
	}

	@Override
	public void withdraw() {
		System.out.println("enter the withdraw amount");
		int w=sc.nextInt();
		balance=balance-w;
		System.out.println("Balance after withdrawal  ="+balance);
		
	}
	
}

public class Bankinterface1 {

	public static void main(String[] args) {
		SBI11 ob=new SBI11();
		ob.showdetails();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
		
	}

}
