package project;
import java.util.Scanner;

class Persentage
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
		
		System.out.println("\nYour Persentage Is: "+ persentage);
		//System.out.println(marksT);
	}
		
}