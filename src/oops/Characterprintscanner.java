package oops;

import java.util.Scanner;

public class Characterprintscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name");
		Scanner sc= new Scanner(System.in);
		char c = sc.nextLine().charAt(2);
		System.out.println("Character is "+c);
	}
	
}
