#include<stdio.h>
int main()
{
	int i,j,k,n=5;
	char charThis='A';
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=n-i+1; j++)
		{
			printf(" ");
		}
		for(k=1; k<=i; k++)
		{
			if(i%2==0)
			{
				printf("%c ", charThis++);
			}
			else
			{
				printf("%d ", k);
			}
		}
		printf("\n");
	}
}
