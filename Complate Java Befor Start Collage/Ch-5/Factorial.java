package ch_5;
import java.util.Scanner;

public class Factorial
{
		public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Integer that you can know Factorial! \nOnly for 1 to 170 \nOther wise your answer is Infinity");
		int num =sc.nextInt();
		double multi=1;
		
			for (int i=1; i<=num; i++)
			{
				multi*=i;
				//System.out.println(i);
			}
			System.out.println("The "+num+"! "+"is "+multi);
			
	}
}