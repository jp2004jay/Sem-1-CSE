package ch_2;
import java.util.Scanner;

public class Chapter_2_PS
{
		public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
	
		//This is a First Problem
			float a =7/4.0f*9/2.0f;
			System.out.println(a);
		
		//This is Second Problem
			char grade = 'C';
			grade=(char)(grade+8);
			System.out.println("Encripting: "+grade);
		
			grade=(char)(grade-8);
			System.out.println("Dycripting: "+grade);
		
		//This is Third Problem
			System.out.println("Enter Any Integer Number: ");
			int b= sc.nextInt();
			System.out.println(b>8);
		
		//This is Forth Problem
			float v=10f, u=4f, t=9f, s=2f;
			float calcuat = (v*v - u*u)/2*t*s;
			System.out.println(calcuat);
		
		//This is a Fifth Problem
			float x =7.49f/7f+35f/7f;
			System.out.println(x);
	}
}