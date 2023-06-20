package oops;

		class member
		{
			
				int age,salary;
				String name,address,phoneno;
				
			
			public void printdetails()
			{
				System.out.println("name ="+name);
				System.out.println("age="+age); 
				System.out.println("phoneno ="+phoneno);
				System.out.println("address= "+address);
				System.out.println("salary= "+salary);
			}
		}
		class Employee1 extends member
		{
			String specialization;
			public String name;
			public int age;
			public String phoneno;
			public String address;
			public int salary;
		}
		class Manger extends member
		{
			String department;
		}
		
		
		public class Inheritancepgm {	
			public static void main(String[] args) {
				Employee1 emp1=new Employee1();
				emp1.name="arun";
				emp1.age=24;
				emp1.phoneno="797868675";
				emp1.address="hghfh";
				emp1.salary=1000;
				System.out.println(emp1.specialization="tester");
				emp1.printdetails();
				//Manager m= new Manager(m.);
		

		
	}


}