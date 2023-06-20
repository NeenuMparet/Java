package pack;
class Animal
{
	public void Animalfood()
	{
		System.out.println("animal food");
	}
}
class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}
public class singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog ob=new Dog();
ob.Animalfood();
ob.breed();

	}

}
