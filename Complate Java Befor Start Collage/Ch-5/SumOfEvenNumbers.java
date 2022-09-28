package ch_5;
import java.util.Scanner;

public class SumOfEvenNumbers
{
		public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter Any \"Even\" Integer Number: ");
			int num=sc.nextInt();
		
			int i=-1;
			int sum=0;
		
			while(i<num)
			{
				i=i+2;
				sum+=i ;
			}
			System.out.println(sum);
	}
}