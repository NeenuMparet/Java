package pack;
class Monkey
{
	public void jump() {
		System.out.println("Jumping");
	}
	public void bite() {
		System.out.println("Biting");
	}
	
}
interface Basicanimal 
{
	public void eat();
	public void sleep();
}
class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("Speaking");
	}

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
		
	}
}

public class Interfacequestion {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.bite();
		ob.eat();
		ob.jump();
		ob.sleep();
		ob.speak();

	}

}
