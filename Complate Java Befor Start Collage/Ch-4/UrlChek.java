package ch_4;
import java.util.Scanner;
public class UrlChek
{
		public static void main(String []args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter Valid Website URL: ");
			String url=sc.nextLine();
		
			if(url.endsWith(".com"))
			{
					System.out.println("This is a Comercial Website.");
			}
			
			else if(url.endsWith(".gov"))
			{
					System.out.println("This is a Government Website.");
			}
			
			else if(url.endsWith(".in"))
			{
					System.out.println("This is a Indian Website.");
			}
			else
			{
					System.out.println("Invalid Argument!");
			}
	}
}