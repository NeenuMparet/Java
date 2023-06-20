package controlstmts;

public class Reversenumberwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3456;
		int r,rev = 0;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			System.out.print(r);
			
		}
		

	}

}
