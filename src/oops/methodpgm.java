package oops;

public class methodpgm {
//method without parameters and return type
	public void add()
	{
		int a=30,b=50;
		int c=a+b;
		System.out.println("sum ="+c);
	}
	//method with return type and without parameters
	public int sub()
	{
	int a=60,b=40;	
	int c= a-b;
	return c;
	}
	//method with return type and with parameter
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	//method without return type and with parameter
	public void div(double a,double b)
	{
		double c=a/b;
		System.out.println("division ="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodpgm ob =new methodpgm();
ob.add();
int subt =ob.sub();
System.out.println("Substraction ="+subt);
System.out.println("Multiplication = "+ob.mul(30,20));
ob.div(2,3);
	}

}
