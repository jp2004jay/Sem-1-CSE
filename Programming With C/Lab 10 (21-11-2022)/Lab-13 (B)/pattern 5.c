#include<stdio.h>
int main()
{
	int i,j,n=5;
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n*2-1; j++)
		{
			if(i==1 || i==n || j==1 || j==n*2-1)
			{
				if(j%2 == 0)
				{
					printf(" ");
				}
				else
				{
					printf("*");		
				}
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
}
