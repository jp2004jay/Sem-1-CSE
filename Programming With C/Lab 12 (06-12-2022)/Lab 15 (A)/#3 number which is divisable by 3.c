#include<stdio.h>
int main()
{
	int i, a[32], n, count=0;
	printf("How many element do you enter: ");
	scanf("%d", &n);
	for(i=0; i<n; i++)
	{
		printf("Enter element of %d index: ",i);
		scanf("%d", &a[i]);
		
		if(a[i]%3==0)
		{
			count++;
		}
	}
	printf("\nTotal Numbers are %d which is divisable by three", count);
	return 0;
}
