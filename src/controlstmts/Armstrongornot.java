package controlstmts;

import java.util.Scanner;

public class Armstrongornot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the three digit number");
		int n=sc.nextInt();
		int num=n,cubesum=0,r;
		while(num>0)
		{
			r=num%10;
			cubesum=cubesum+(r*r*r);
			num=num/10;
		}
		if(n==cubesum)
		{
			System.out.println(n+"   is Armstrong");
		}
		else
		{
			System.out.println(n+"is not Armstrong");
		}
	}

}
