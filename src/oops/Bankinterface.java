package oops;
import java.util.Scanner;

interface Bank
{
	public void showdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}
class Sbi implements Bank
{
	static String bankname="sbi";
	 int accountno;
	 String accountname="Ajish Chacko";
	 int balance=40000;
	 Scanner sc=new Scanner(System.in);
	 
 public void showdetails()
 {
	 System.out.println("Enter the accountno");
	 accountno=sc.nextInt();
	 System.out.println("Account Number   :"+accountno);
	 System.out.println("Customer name     :"+accountname);
	 System.out.println("Customer Bankname  :"+bankname);
	 System.out.println("current balance  :"+balance);
 }  

@Override
public void balance() {
	System.out.println(balance);
	
}

@Override
public void deposit() {
	System.out.println("enter the deposit amount");
	int amount=sc.nextInt();
	balance=balance+amount;
	System.out.println("Balance amount after deposit "+balance);
}

@Override
public void withdraw() {
	System.out.println("enter the amount to withdraw");
	int withdrawl=sc.nextInt();
	balance=balance-withdrawl;
	System.out.println("Balance amount after withdrawal "+balance);	
}
}



public class Bankinterface {

	public static void main(String[] args) {
	Sbi ob=new Sbi();
	ob.showdetails();
	ob.balance();
	ob.withdraw();
	ob.deposit();
	
	}

}
