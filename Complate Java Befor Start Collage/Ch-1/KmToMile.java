package ch_1;
import java.util.Scanner;

public class KmToMile
{
		public static void main (String [] args)
		{
				Scanner sc=new Scanner (System.in);
				System.out.println("Enter Km to Convert it: ");
				float km=sc.nextFloat();
			
				float mile = km*0.621371f ;
				System.out.println(km+" Km is "+mile+" Miles");
				
		}
}