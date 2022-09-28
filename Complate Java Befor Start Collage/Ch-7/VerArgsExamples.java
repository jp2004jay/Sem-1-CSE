package ch_7;
public class VerArgsExamples
{
	static float aveOfNum(int ...a)
	{
		float sum=0;
		float ave;
		
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		ave=sum/a.length;
		
		return ave;
	}
	public static void main (String [] args)
	{
		System.out.println("Welcome to VerArgs");
		System.out.println(aveOfNum(4,5,6));
		System.out.println(aveOfNum(3,7,2,8,4,5,6));
		System.out.println(aveOfNum(93,77,22,88,44,75,66));
	
	}
}