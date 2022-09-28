import java.util.Scanner;

public class PrimeNumberUsingTry_Catch_Block
{
		static void print()
		{
			System.out.println("\nYour Prime Number Is:");
		}
		
		public static void main(String [] args)
		{
			
			Scanner sc=new Scanner (System.in);
			int userIn;
			
			System.out.println("Welcome To Find Prime Numbers Programme");
			System.out.println("Enter Integer Between 2 to 1000");
			
			try
			{
				userIn= sc.nextInt();
			
				int num[] = {2, 3, 5, 7};
			
				if(userIn<2 || userIn>1000)
				{
					System.out.println("You Entered Number Is Invalid! \nTherefor Sorry! \nPlease Read First Note Carefully.");
				}
			
				else if(userIn==2)
				{
					print();
					System.out.println(num[0]);
				}
			
				else if (userIn==3 || userIn==4)
				{
					print();
					System.out.println(num[0]+"\n"+num[1]);
				}
			
				else if(userIn==5 || userIn==6)
				{
					print();
					System.out.println(num[0]+"\n"+num[1]+"\n"+num[2]);
				}
				
				else
				{
					print();
					
					for(int nu : num)
					{
						System.out.println(nu);
					}
				
					for (int i=2; i<=userIn; i++)
					{
						if(i%2==0 || i%3==0 || i%5==0 || i%7==0)
						{
							continue;
						}
				
						else
						{
							System.out.println(i);
						}
					}
				}
			}
			
			catch(Exception e)
			{
				System.out.println("You Hava Entered Vey Large Or Invalid Integer Number"+"\n"+e);
			}
		
		}
}