package ch_5;
import java.util.Scanner;

public class StarPattern
{
		public static void main(String []args)
	{
	
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Any Integer Number: ");
		int num=sc.nextInt();
			for(int i=0; i<num; i++)
			{
				for(int j=0; j<i+1; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			for(int i=num; i>0; i--)
			{
				for(int j=0 ; j<i; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
	}
}