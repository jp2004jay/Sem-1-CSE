package ch_5;
import java.util.Scanner;

public class TableOfMultipication
{
		public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter Integer that you can get multiplication table: ");
			int table=sc.nextInt();
			int answer=0;
			
			for(int i=1; i<=10; i++)
			{
				answer=table*i;
				System.out.println(table+" x "+i+" = "+answer);
			}
			
			System.out.println("\nReverse Table");
			
			for(int i=10; i>=1; i--)
			{
				answer=table*i;
				System.out.println(table+" x "+i+" = "+answer);
			}
	}
}