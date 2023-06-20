package oops;

import java.util.Scanner;

public class Calculatorscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a= ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter b= ");
		int b = sc.nextInt();
		System.out.println("enter the choice 1.add 2.sub 3.mult 4.div");
		int opt= sc.nextInt();
		double result=0;
		switch(opt)
		{
		
		case 1:result=a+b;
				break;
	
		case 2:result=a-b;
		break;
		case 3:result=a*b;
		break;
		case 4:if(b==0)
		
		{
			System.out.println("error");
		}
		else{
			result=a/b;
		}
		break;
	default:System.out.println("invalid choice");
		}
		System.out.println("result= "+result);
		
	}

}
