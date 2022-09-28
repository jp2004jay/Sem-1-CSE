package ch_9;
class Student1
{
		private int rollNum;
		private String name;
	
			public void setRollNum(int r)
			{
				rollNum=r;
				System.out.println(rollNum);
			}
			
			public void setName(String n)
			{
				name = n;
				System.out.println(name);
			}
			
			
}

public class Getter_and_Setter
{
		public static void main(String [] args)
	{
		Students s1= new Students();
		s1.setRollNum(23);
		s1.setName("Shubham");
		
		
	}
}