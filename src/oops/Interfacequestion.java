package oops;
interface Tvremote
{
	public void Channelup();
	public void Channeldown();
	public void Volumeup();
	public void Volumedown();
}
interface Smarttvremote extends Tvremote
{
	public void Bluetooth();
	public void Voicesearch();
}
 
class Tv implements Smarttvremote
{

	@Override
	public void Channelup() {
		System.out.println("Channel up");
		
	}

	@Override
	public void Channeldown() {
		System.out.println("Channel down");
		
	}

	@Override
	public void Volumeup() {
		System.out.println("Volumeup");
		
	}

	@Override
	public void Volumedown() {
		System.out.println("Volumedown");
		
	}

	@Override
	public void Bluetooth() {
		System.out.println("Bluetooth");
		
	}

	@Override
	public void Voicesearch() {
		System.out.println("Voicesearch");
		
	}
	
	
	
}
public class Interfacequestion {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.Bluetooth();
		ob.Channeldown();
		ob.Channelup();
		ob.Voicesearch();
		ob.Volumedown();
		ob.Volumeup();

	}

}
