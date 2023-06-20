package oops;

public class Exceptionpgm {

	public static void main(String[] args) {
		// Arithematic exception
		try
		{
			int a =20;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithematic Exception");
}
		try {
			int a[]=new int[2];
			a[0]=34;
			a[1]=24;
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("Arrayinderoutofbound Exception");
		}
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println("Nullpointer Exception");
		}
	}

}
