package ch_6;
public class AverageOfArray
{
		public static void main (String [] args)
	{
			int marks[]={89, 90, 100, 78, 65};
			float sum=0;
			float average;
			
			for(int i=0; i<marks.length; i++)
			{
				sum+=marks[i];
			}
			
			average=sum/marks.length;
			System.out.println("The Average Of This Array Element: "+average);
	}
}