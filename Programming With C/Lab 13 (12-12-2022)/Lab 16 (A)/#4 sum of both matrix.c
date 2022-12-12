#include<stdio.h>
int main()
{
	int i, j , a[3][3], b[3][3], sum[3][3], n=3;
	
	printf("\nEnter first matrix\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<n; j++)
		{
			printf("Enter element of index [%d][%d]: ", i,j);
			scanf("%d", &a[i][j]);
		}
	}
	
	printf("\nEnter second matrix\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<n; j++)
		{
			printf("Enter element of index [%d][%d]: ", i,j);
			scanf("%d", &b[i][j]);
		}
	}
	
	printf("\nSum of both matrix\n");
	for(i=0; i<n; i++)
	{
		for(j=0; j<n; j++)
		{
			sum[i][j] = a[i][j] + b[i][j];
			
			printf("%d ", sum[i][j]);
		}
		printf("\n");
	}
	
}
