package ch_5;
public class DoWhileLoop
{
	public static void main(String [] args)
	{
		System.out.println("Once Time Executed!");
		int i=0;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<0);
		
		System.out.println("\nTwo Time Executed!");
		int j=0;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<2);
		
		System.out.println("\nMore Than One Time Executed!");
		int k=0;
		do
		{
			System.out.println(k);
			k++;
		}
		while(k<10);
	}
}