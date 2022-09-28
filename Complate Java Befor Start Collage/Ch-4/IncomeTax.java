package ch_4;
import java.util.Scanner;

public class IncomeTax
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Income: ");
		long income=sc.nextLong();
		
		if(income<=250000)
		{
			System.out.println("You Don't Paid Income Tax.");
		}
		
		else if(250000<income && income<=500000)
		{
			System.out.println("You have paid 5% Tax.");
		}
		
		else if(500000<income && income<=1000000)
		{
			System.out.println("You have paid 20% Tax.");
		}
		
		else
		{
			System.out.println("You have paid 30% Tax.");
		}
	}
}