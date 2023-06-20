package oops;

public class Methodoverload {
	public void add() 
	{
		int a=20;
		int b=40;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
	public static void main(String[] args) {
		
Methodoverload ob=new Methodoverload();
ob.add();
ob.add(50, 60);
ob.add(50.7, 40);
ob.add(57, 78.6);
	}

}
