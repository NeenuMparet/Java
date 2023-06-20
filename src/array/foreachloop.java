package array;

import java.util.Scanner;

public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a[]=new int[3];
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("entered numbers:");
		for(int v:a)
		{
			System.out.println(v);
		}
	}

}
