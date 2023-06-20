package oops;
abstract class Car1
{
	public abstract void speedlimit();
	public void carengine() {
		System.out.println("Car engine");
	}
	
}
class Maruti extends Car1{

	@Override
	public void speedlimit() {
		
		System.out.println("Maruti speedlimit");
	}
	
}
class BMW2 extends Car1
{
	public void speedlimit()
	{
		System.out.println("BMW Speedlimit");
	}
}
public class Abstractionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW2 B =new BMW2();
B.speedlimit();
Maruti M=new Maruti();
M.speedlimit();
M.carengine();
	}

}
