#include<stdio.h>
int main()
{
	int i,j,a[3][3], nagetive=0, positive=0, zero=0;
	
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("Enter element of [%d][%d] index: ",i,j);
			scanf("%d", &a[i][j]);
			
			if(a[i][j]<0)
			{
				nagetive++;
			}
			else if(a[i][j]==0)
			{
				zero++;
			}
			else
			{
				positive++;
			}
		}
	}
	
	printf("\nPositive numbers count is: %d",positive);
	printf("\nNagetive numbers count is: %d",nagetive);
	printf("\nZero count is: %d",zero);
}
