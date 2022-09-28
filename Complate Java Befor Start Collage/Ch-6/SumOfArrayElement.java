package ch_6;
public class SumOfArrayElement
{
		public static void main(String [] args)
		{
			int sum=0;
			int marks[]={78, 98, 67, 89, 90};
			for(int i=0; i<marks.length; i++)
			{
				sum+=marks[i];
			}
			System.out.println(sum);
		}
}