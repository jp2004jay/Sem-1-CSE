package ch_7;
import java.util.Scanner;

public class RepitationUsingRecursation
{
	static int repeat4Fun(int a)
	{
		System.out.println("4");
		a--;
		
		if(a<=0)
		{
			return 0;
		}
		else
		{
			return repeat4Fun(a);
		}
	}
	
	static int repeat2Fun(int a)
	{
		System.out.println("2");
		a--;
		
		if(a<=0)
		{
			return 0;
		}
		else
		{
			return repeat2Fun(a);
		}
	}
		public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
		
			System.out.println("\nHowmany times you can print \"4\"");
			int num1=sc.nextInt();
			System.out.println("\n");
			repeat4Fun(num1);
			
			System.out.println("\nHowmany times you can print \"2\"");
			int num2=sc.nextInt();
			System.out.println("\n");
			repeat2Fun(num2);
		
			System.out.println("\nHowmany times you can print \"3\" (Iterative Approch)");
			int num3 = sc.nextInt();
			System.out.println("\n");
		
			for(int i=0; i<num3; i++)
			{
				System.out.println("3");
			}
			
	}
}