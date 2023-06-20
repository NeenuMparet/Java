package oops;
interface Bank1
{
	public void deposit();
	public void withdraw();
	public void balance();	
	
}
interface Creditcard
{
	public void creditcarddetails();
}
class SBI1 implements Bank,Creditcard
{

	@Override
	public void creditcarddetails() {
		System.out.println("SBI Creditcarddetails");
		
	}

	@Override
	public void deposit() {
		System.out.println("SBI deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI withdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("SBI balance");
		
	}

	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		
	}
	
}
 class Federal1 implements Bank,Creditcard
{

	@Override
	public void creditcarddetails() {
		System.out.println("Federal Creditcarddetails");
	}

	@Override
	public void deposit() {
		System.out.println("Federal deposit");
		
		
	}

	@Override
	public void withdraw() {
		System.out.println("Federal withdraw");
		
		
	}

	@Override
	public void balance() {
		System.out.println("Federal balance");
		
		
	}

	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		Bank ob=new SBI1();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
		ob=new Federal1();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
		

	}

}
