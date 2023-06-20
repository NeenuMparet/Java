package pack;

import java.util.Scanner;

public class Sumofevenandoddintergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a set of intergers");
Scanner sc=new Scanner(System.in);

int evensum=0;int oddsum=0;
for(int i=1;i<=4;i++)
{
	int n =sc.nextInt();
	
if(n%2==0) {
evensum=evensum+n;
}
else
{
	oddsum=oddsum+n;
	
}
}
System.out.println("Sum of even Intergers " + evensum);
System.out.println("Sum of odd Intergers " + oddsum);
	}
}


