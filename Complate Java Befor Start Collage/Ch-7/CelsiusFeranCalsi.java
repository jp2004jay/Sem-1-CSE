package ch_7;
import java.util.Scanner;

public class CelsiusFeranCalsi
{
	static float celsToFeran(float C)
	{
		return (C * 9/5) + 32;
	}
	
	static float feranToCels(float F)
	{
		return (F - 32) * 5/9;
	}
	
		public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter *C And *F To Calculat Multiple Times: ");
		float num = sc.nextFloat();
		
		System.out.println(num+"*C is calculated to "+celsToFeran(num)+"*F");
		System.out.println(num+"*F is calculated to "+feranToCels(num)+"*C");
	}
}