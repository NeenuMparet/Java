package pack;

public class Operatorspgm {

	public static void main(String[] args) {
		// Airthmatic operator
		int a=50,b=70;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		//Assignment operators
		int c=30,d=20;
		System.out.println("c+=d="+(c+=d));//c=c+d 30+20=50
		System.out.println("c-=d="+(c-=d));//c=c-d  50-20=30
		System.out.println("c*=d="+(c*=d));
		System.out.println("c/=d="+(c/=d));//c=c/d  600/20=30
		System.out.println("c%=d="+(c%=d));//c=c%d  30/20 =10
		//Relational Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//Logical operators
		// A   B   A &&B   A||B   !A  !B
	//     0   0    0       0      1   1
	//	   1   0    0       1      0   1
	//	   0   1    0       1      1   0
	  //   1   1    1       1      0   0
		
		String username="abc";
		String pswd="123";
		System.out.println(username=="abc" && pswd=="123");//true
		System.out.println(username=="abc" || pswd=="1234");//true
		System.out.println(!(username=="abc"));//false
		//unary operators
		//++ increment by 1
		//-- decrement by 1
		//d1++ - postincrement
		//++d1 - preincrement
		//d1-- - postincrement
		//--d1 - preincrement
		int d1=5;
		System.out.println(d1++);//5
		System.out.println(d1);//6
		System.out.println(d1--);//6
		System.out.println(d1);//5
		// swap two numbers and assign to a variable
		int e=20,f=30;
		int g=e;
		e=f;
		System.out.println();
	}

}
