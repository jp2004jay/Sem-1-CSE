import java.util.Scanner;
public class Chance_5
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Index Of Chance:");
		
		int marks [] = {45, 23, 89, 12, 34, 67};
		int index;
		int i = 0;
		boolean flag = true;
		
		while(flag && i<5)
		{
			try
			{
				System.out.println("Enter Array Index:");
		
				index=sc.nextInt();
				System.out.println("Array Index Of: "+ marks[index]);
				break;
			}
			
			catch(Exception e)
			{
				System.out.println("Sorry!"+"\n"+e);
				i++;
			}
		}
	}
}