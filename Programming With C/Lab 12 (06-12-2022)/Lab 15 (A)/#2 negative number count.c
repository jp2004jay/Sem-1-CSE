#include<stdio.h>
int main()
{
	int i, a[32], n, count=0;
	
	printf("How many element do you want to enter?: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter element of %d index: ",i);
		scanf("%d", &a[i]);
		
		if(a[i]<0)
		{
			count++;
		}
	}
	printf("\nTotal nagative numbers are: %d",count);
}
