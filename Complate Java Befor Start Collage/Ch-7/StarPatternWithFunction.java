package ch_7;
import java.util.Scanner;

public class StarPatternWithFunction
{
		static void starPattern(int num)
	{
		for(int i=0; i<num; i++)
			{
				for(int j=0; j<i+1; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
	}
	
		static void starReversed(int num)
	{
		for(int i=num; i>0; i--)
			{
				for(int j=0 ; j<i+1; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
	}
	
		public static void main(String []args)
	{
	
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Any Integer Number\nFor Better Result! \n\"Enter 3 To 8\" : ");
		int userNum=sc.nextInt();
		
		if(userNum<3 || userNum>8)
		{
			System.out.println("You Have Entered Invalid Choise \nPlease Read Note Than Continue");
		}
		else
		{
			
			starPattern(userNum);		
			starReversed(userNum);
		
			starPattern(userNum);		
			starReversed(userNum);
		
			starPattern(userNum);		
			starReversed(userNum);

			starPattern(userNum);		
			starReversed(userNum);
		
			starPattern(userNum);		
			starReversed(userNum);
			System.out.println("*");
		}
	}
}