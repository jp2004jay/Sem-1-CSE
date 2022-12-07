#include<stdio.h>
int main()
{
	int i,n, a[32];
	printf("How many element you can enter? : ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("\nEnter element of %d : ", i);
		scanf("%d", &a[i]);
	}
	printf("\nPrint Normal\n");
	for(i=0; i<n; i++)
	{
		printf("%d\n", a[i]);
	}
	printf("\nPrint Reverse\n");
	for(i=n-1; i>=0; i--)
	{
		printf("%d\n", a[i]);
	}
}
