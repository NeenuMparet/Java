package oops;
	class Car
	{
		public void accelerator() {
			System.out.println("accelerator");
		}
	}
	class BMW1 extends Car{

		@Override
		public void accelerator() {
			System.out.println("BMW Accelerator");
			super.accelerator();
		}
		
		}
	public class Methodoverriding {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		BMW1 b=new BMW1();
		b.accelerator();
	}

}
