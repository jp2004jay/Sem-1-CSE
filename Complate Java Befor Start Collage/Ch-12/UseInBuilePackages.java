package ch_12;
public class UseInBuilePackages
{
	public static void main(String [] args)
	{
		//With Out Import Scanner Library.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter The Integer Number");
		int a = sc.nextInt();
		System.out.println("You Entered The "+a);
	}
}