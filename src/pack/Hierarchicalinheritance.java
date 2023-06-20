package pack;
class Animals1
{
	public void animaldetails()
	{
		System.out.println("animal details");
	}
}
class Dogs extends Animals1
{
	public void dogdetails()
	{
		System.out.println("Dog details");
	}
}
class Tiger extends Animals1
{
	public void tigerdetails()
	{
		System.out.println("Tiger details");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dogs b=new Dogs();
b.animaldetails();
b.dogdetails();
Tiger t =new Tiger();
t.animaldetails();
t.tigerdetails();
	}

}
