#include<stdio.h>
int main()
{
	int i, n, a[32], nagetive=0, positive=0;
	printf("Howmany element do you enter?: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("\nEnter element of %d index ",i);
		scanf("%d", &a[i]);
		if(a[i]<0)
		{
			nagetive++;
		}
		else 
		{
			positive++;
		}
	}
	printf("\nPositive numbers are: %d",positive);
	printf("\nNagetive numbers are: %d",nagetive);
	return 0;
}
