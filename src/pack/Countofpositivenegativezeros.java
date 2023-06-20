package pack;

import java.util.Scanner;

public class Countofpositivenegativezeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
int countp=0,countn=0,countz=0;
for(int i=0;i<=3;i++)
{
	int n=sc.nextInt();
	if(n>0)
	{
		countp++;
	}
	else if(n<0)
	{
		countn++;
	}
	else
	{
		countz++;
	}
}

System.out.println("Total Positive intergers: "+countp);
System.out.println("Total Positive intergers: "+countn);
System.out.println("Total Positive intergers: "+countz);
	}

}
