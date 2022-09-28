package ch_4;
import java.util.Scanner;

public class PassOrFail
{
		public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Howmany marks of First Paper is?\n");
		int marksT= sc.nextInt();
		int totalMarks=marksT*5;
		
		System.out.println("Enter marks out of "+marksT);
		
		System.out.println("\nEnter Your Marks Of Maths: ");
		int maths = sc.nextInt();
		
		System.out.println("Enter Your Marks Of Science: ");
		int science = sc.nextInt();
		
		System.out.println("Enter Your Marks Of English: ");
		int english = sc.nextInt();
		
		System.out.println("Enter Your Marks Of Gujarati: ");
		int gujarati = sc.nextInt();
		
		System.out.println("Enter Your Marks Of Hindi: ");
		int hindi = sc.nextInt();
		
		float givenMarks = maths + science + english + gujarati + hindi;
		float persentage= (givenMarks*100)/totalMarks;
		
		float mathsp=(maths*100)/marksT;
		float sciencep=(science*100)/marksT;
		float englishp=(english*100)/marksT;
		float gujaratip=(gujarati*100)/marksT;
		float hindip=(hindi*100)/marksT;
		
		System.out.println("\nYour Persentage Is: "+ persentage);
		
		if(persentage<33 || mathsp<40 || sciencep<40 || englishp<40 || gujaratip<40 || hindip<40)
		{
				System.out.println("\nYou Are Fail! \nTry Better Luck In Next Time.");
		}
		else
		{
				System.out.println("Congratulation! \nYou Are Pass In This Exam.");
		}
		//System.out.println(marksT);
	}
		
}