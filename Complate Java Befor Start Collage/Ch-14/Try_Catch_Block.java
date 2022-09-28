import java.util.Scanner;
public class Try_Catch_Block
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter First Integer Number: ");
			int a= sc.nextInt();
			
			System.out.println("Enter First Integer Number: ");
			int b= sc.nextInt();
			int c= a/b;
			
			System.out.println("The Division Of C Is: "+ c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Ha..Ha.."+"\n"+e);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("He..He.."+"\n"+e);
		}
		catch (Exception e)
		{
			System.out.println("You Are Naughty!"+"\n"+e);
		}
	}
}