#include<stdio.h>
void printArray(int, int[]);
int main()
{
	int i, n, a[100];
	printf("Howmany element do you enter? ");
	scanf("%d", &n);
	for(i=0; i<n; i++)
	{
		printf("Enter element: ");
		scanf("%d", &a[i]);
	}
	printArray(n,a);
}
void printArray(int n, int a[])
{
	int i;
	printf("\nArray is: \n");
	for(i=0; i<n; i++)
	{
		printf("%d ", a[i]);	
	}
}
