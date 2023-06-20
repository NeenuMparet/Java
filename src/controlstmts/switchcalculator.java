package controlstmts;

public class switchcalculator {

	public static void main(String[] args) {
		// switch stmts calculator
		int a=5;
		int b=8;
		int opt=3;
		switch(opt)
		{
		
		case 1:System.out.println("a+b="+(a+b));
				break;
	
		case 2:System.out.println("a-b="+(a-b));
		break;
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
	default:System.out.println("invalid");
		}
	}

}
