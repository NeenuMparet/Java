package pack;
class Animal1
{
	public void Animalfood()
	{
		System.out.println("animal food");
	}
}
class Dog1 extends Animal1
{
	public void breed()
	{
		System.out.println("lab");
	}
}
class Babydog extends Dog1
{
	public void babydogfeatures()
	{
		System.out.println("Babydog");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog ob=new Babydog();
		ob.Animalfood();
		ob.breed();
		ob.babydogfeatures();

	}

}
