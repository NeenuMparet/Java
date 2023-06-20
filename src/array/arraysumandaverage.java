package array;

import java.util.Scanner;

public class arraysumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		System.out.println("enter the numbers");
		Scanner sc= new Scanner(System.in);
		int sum=0,avg=0;
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
			 sum =sum+a[i];
			 avg=sum/4;
			
		}
		System.out.println("sum="+sum);
		System.out.println("average="+avg);

	}

}
