package ch_7;
import java.util.Scanner;

public class FactorialAndFibonachhi
{
	static double factorial (int a)
	{
		if(a==0 || a==1)
		{
			return 1;	
		}
		else
		{
			return a*factorial(a-1);
		}
	}
	
	static int fibonachi (int a)
	{
		if(a==0)
		{
			return 0;	
		}
		else if(a==1)
		{
			return 1;
		}
		else
		{
			return fibonachi(a-1)+fibonachi(a-2);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Factorial Calculator");
		System.out.println("Enter Number To Know The Factorial (Valid for \"1 to 170\"): ");
		int fac=sc.nextInt();
		
		if(fac<0 || fac>170)
		{
			System.out.println("You Have Entered Invalid Aarguments!");
		}
		else
		{
			System.out.println(fac+"! is "+factorial(fac));
		}
	
		System.out.println("\nWelcome To Fibonachi Calculator");
		System.out.println("Enter Number To Know The Fibonachi (Valid for\"1 to 40\"): ");
		int fib=sc.nextInt();
		
		if(fib<0 || fib>40)
		{
			System.out.println("You Have Entered Invalid Aarguments!");
		}
		else
		{
			System.out.println(fib+" is "+fibonachi(fib));
		}		
	}
}