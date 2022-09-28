package ch_1;
import java.util.Scanner;

public class CheakNumber
{
		public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter any Integer Number: ");
			
		try
		{
			int num=sc.nextInt();
			System.out.println("Your Integer is: "+num);
		}
		catch(Exception c)
		{
			System.out.println("Entered your number is not Integer!");
		}
	}
}