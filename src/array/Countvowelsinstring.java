package array;

import java.util.Scanner;

public class Countvowelsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter the string");
String a= sc.nextLine();//hello
int c=0;
for(int i=0;i<a.length();i++)
{
	
if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
{
c++;	
}

	}
System.out.println("vowel count  = "+c);

}
}
