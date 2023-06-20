package array;

public class Stringoperations {

	public static void main(String[] args) {
		// 1.concatenation
		String s="hello";
		String s1="      welcome    ";
		String s2="Hello how are you";
		System.out.println(s.concat(s1));// hello   welcome
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5);//3hello45
		//2.equals
		System.out.println(s.equals(s1));
		//3.contains
		System.out.println(s2.contains("how"));
		//touppercase &tolowercase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		//trim
		System.out.println(s1.trim());
		//length
		System.out.println(s.length());
		//Startswith
		System.out.println(s2.startsWith("Hello"));
		//endswith
		System.out.println(s2.endsWith("you"));
		//substring
		System.out.println(s2.substring(2, 6));
		//CharAt()
		System.out.println(s.charAt(1));
		//split
		String[] sr=s2.split(" ");
		for(String V:sr)
		{
			System.out.println(V);
		}
	}

}