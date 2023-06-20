package controlstmts;

public class Countofnumberwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3456;
		int c=0;
		while(n>0)//1.3456 2.345 3.34 4.3
			
		{
		n=n/10;//1.. 3456/10=345  2. 345/10=34		3. 34/10  4. 3/10=0
		 c++;//  1                  2                3            4
			
		}
		System.out.println("count="+c);
		

	}

}
