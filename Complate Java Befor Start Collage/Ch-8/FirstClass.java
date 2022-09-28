package ch_8;
class Employee
{
	int salary;
	String name;
		
		public void setSalary(int s)
		{
				salary=s;
				System.out.println(s);
		}
		
		public void setName(String n)
		{
				name=n;
				System.out.println(n);
		}
	
}

public class FirstClass
{
		public static void main(String [] args)
	{
		Employee tushar=new Employee();
		tushar.setName("Kacha Tushar");
		tushar.setSalary(12000);
	}
}