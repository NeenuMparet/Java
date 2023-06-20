package oops;

import java.util.Scanner;

public class Scanneradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a =");

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("enter b =");
int b = sc.nextInt();
int sum = a+b;
System.out.println("sum ="+sum);
	}

}
