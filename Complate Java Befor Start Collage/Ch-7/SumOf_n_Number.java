package ch_7;
import java.util.Scanner;

public class SumOf_n_Number
{
		static int sumFunc(int a)
		{
			if(a==0)
			{
				return 0;
			}
			else
				return a + sumFunc(a-1);
		}
		public static void main (String [] args)
		{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter Any Integer Number(For Your Safty Enter \"1 to 1000\"): ");
				int n=sc.nextInt();
				
				if(n<0 || n>1000)
				{
					System.out.println("Please Read Note Carefully \nYou have Entered Unexpected Number");
				}
				else
				{
					System.out.println(sumFunc(n));
				}
			
		}
}