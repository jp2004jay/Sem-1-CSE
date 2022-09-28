package ch_5;
public class HalfKiteShape
{
		public static void main(String []args)
	{
	
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<i+1; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			for(int i=8; i>0; i--)
			{
				for(int j=0 ; j<i; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
	}
}