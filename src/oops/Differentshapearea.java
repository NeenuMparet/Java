package oops;
class Shapearea{
public void triangle()
{
	int b=5,h=5;
	double area=0.5*b*h;
	System.out.println(area);
}
public int rect() {
	int l=4,b=5;
	int area=l*b;
	return area;
}
public void circle(int r) {
	
	int area=(int) (3.14*r*r);
	System.out.println(area);
}
public void square(int a) {
	
	double area=a*a;
	System.out.println(area);
	;
}
}
public class Differentshapearea {

	public static void main(String[] args) {
	Shapearea ob=new Shapearea();
	ob.triangle();
int rects=ob.rect();
System.out.println("area of rectangle"+rects);
	}


	}



