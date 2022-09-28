package ch_6;
import java.util.Scanner;
			
public class CheakNumberInArray
{
	public static void main(String [] args)
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the Integer: ");
			int userNum=sc.nextInt();
		
			int evenNum[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

			for(int i=0; i<evenNum.length; i++)
			{
				if(evenNum[i]==userNum)
				{
					System.out.println(i+" Element Is An Array");
				}
		
				else
				{
					System.out.println(i+" Element Is Not An Array");
				}
			}
	}
}