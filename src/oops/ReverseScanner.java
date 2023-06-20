package oops;

import java.util.Scanner;

public class ReverseScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,rev=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		while(n>0)
		{
			r= n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reversed number is "+rev);
	}

}
