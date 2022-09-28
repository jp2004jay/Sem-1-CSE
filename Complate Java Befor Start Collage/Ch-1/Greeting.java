package ch_1;
import java.util.Scanner;

public class Greeting
{
		public static void main (String [] args)
	{
			Scanner sc = new Scanner (System.in);
			System.out.println("Please Enter Your Name: ");
			String name = sc.nextLine();
			System.out.println("Hi!\n"+name+"\nHave a Good Day.");
	}
}