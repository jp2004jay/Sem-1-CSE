#include<stdio.h>
int main()
{
	int i,n, a[100], *pa[100];
	
	printf("How many element do you enter?: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter element of index [%d]: ", i);
		scanf("%d", &a[i]);
		pa[i] = &a[i];
	}
	for(i=0; i<n; i++)
	{
		printf("%d ", *pa[i]);
	}
}
