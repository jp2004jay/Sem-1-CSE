#include<stdio.h>
int main()
{
	int i,j,n=5;
	int digit = 0;
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
		{
			if(digit==0)
			{
				digit=1;	
			}
			else
			{
				digit=0;
			}
			printf("%d", digit);
		}
		printf("\n");
	}
}
