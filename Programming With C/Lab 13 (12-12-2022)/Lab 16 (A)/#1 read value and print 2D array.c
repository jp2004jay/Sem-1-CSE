#include<stdio.h>
int main()
{
	int i,j,nc,nr, a[100][100];
	
	printf("How many rows?: ");
	scanf("%d", &nr);
	printf("How many column?: ");
	scanf("%d", &nc);
	
	for(i=0; i<nr; i++)
	{
		for(j=0; j<nc; j++)
		{
			printf("Enter element of [%d] [%d] index: ", i,j);
			scanf("%d", &a[i][j]);
		}
	}
	
	for(i=0; i<nr; i++)
	{
		for(j=0; j<nc; j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
}
