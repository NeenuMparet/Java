package controlstmts;

import java.util.Scanner;

public class Fibanocciseries {

	public static void main(String[] args) {
	System.out.println("enter the nth term");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int n1=0,n2=1,n3;
System.out.println(n1);
System.out.println(n2);

for(int i=0;i<=n;i++)
{
n3=n1+n2;
System.out.println(" "+n3);
n1=n2;
n2=n3;
	}

}
}
