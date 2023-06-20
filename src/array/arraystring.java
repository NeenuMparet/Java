package array;

import java.util.Scanner;

public class arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= new String[5];

		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 names");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("entered names");
	/*	for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
*/
		for (String v:a)
		{
			System.out.println(v);
		}
	}

}
