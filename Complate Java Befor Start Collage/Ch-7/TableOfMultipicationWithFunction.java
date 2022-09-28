package ch_7;
import java.util.Scanner;

public class TableOfMultipicationWithFunction
{
		static void tableFunc(int a)
	{
			int answer=0;
		
			for(int i=1; i<=10; i++)
			{
				answer=a*i;
				System.out.println(a+" x "+i+" = "+answer);
			}
	}
	
		public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter Integer that you can get multiplication table: ");
			int table=sc.nextInt();
			
			tableFunc(table);
		
			
	}
}