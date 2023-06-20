package oops;

import java.util.Scanner;

public class Paliandromescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,rev=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r= n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reversed number is "+rev);
		if(n==temp)
		{
			System.out.println("Paliandrome");
		}
		else {
			System.out.println(" Not Paliandrome");
		}
		

	}

}
