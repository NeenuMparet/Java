package pack;

import java.util.Scanner;

public class avgoftennumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		

		System.out.println("enter ten numbers: ");

		for (int i = 1; i <= 10 ; i++ ) 
			{
			int n = sc.nextInt();
			sum = sum+n;

			}	
			System.out.println("Average of ten numbers= "+sum/10);
	}

}
