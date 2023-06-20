package pack;

public class swappgm {

	public static void main(String[] args) {
		// with temp variable
int a=30,b=50,temp;
	temp=a;//30
	a=b;//50
	b=temp;//30
	System.out.println("after swapping value of a="+a+"value of b="+b);
 
	
	// without temp variable
	int c=40,d=50;
	c=c+d;//40+50=90
	d=c-d;//90-50=40
	c=c-d;//90-40=50
	System.out.println("after swapping value of c="+c+"value of d="+d);
	}

}
