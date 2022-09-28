package ch_1;

import java.util.Scanner;

class PersentageAndCGPA
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
		
		float givenMarks = (maths + science + english + gujarati + hindi);
		float persentage= (givenMarks*100)/totalMarks;
		
		float cGPA= persentage / 9.5f ;
		
		if(cGPA>10)
		{
				cGPA=10 ;
		}
	
		System.out.println("\nYour Persentage Is: "+ persentage);
		System.out.println("Your CGPA Is: "+ cGPA);
		//System.out.println(marksT);
	}
		
}