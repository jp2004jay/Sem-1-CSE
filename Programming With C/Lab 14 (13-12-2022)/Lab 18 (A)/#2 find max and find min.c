#include<stdio.h>

int findMax(int, int);
int findMin(int, int);
int main()
{
	int a, b, max=0, min=0;
	printf("Enter value of a is: ");
	scanf("%d", &a);
	printf("Enter value of b is: ");
	scanf("%d", &b);
	max=findMax(a, b);
	min=findMin(a, b);
	printf("\nMax is: %d",max);
	printf("\nMin is: %d",min);
}
int findMax(int a, int b)
{
	if(a>b)
	{
		return a;
	}
	else
	{
		return b;
	}
}

int findMin(int a, int b)
{
	if(a<b)
	{
		return a;
	}
	else
	{
		return b;
	}
}


