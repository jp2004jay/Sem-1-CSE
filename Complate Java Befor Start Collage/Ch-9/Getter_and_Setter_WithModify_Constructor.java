package ch_9;
class Students
{
	private int rollNum;
	private String name;
			
		public Students(int r, String n)
		{
			rollNum=r;
			name=n;
			System.out.println(r);
			System.out.println(n);
		}
}

public class Getter_and_Setter_WithModify_Constructor
{
		public static void main(String [] args)
	{
		Students s1= new Students(12, "Shubham");
	}
}