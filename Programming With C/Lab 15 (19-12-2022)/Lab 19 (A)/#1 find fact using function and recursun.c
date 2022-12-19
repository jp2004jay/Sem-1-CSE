#include<stdio.h>

int factF(int n);
int factR(int n);

int main()
{
	int n;
	printf("Enter number: ");
	scanf("%d", &n);
	printf("\nFactorial is: %d (using function)", factF(n));
	printf("\nFactorial is: %d (using recursion)", factR(n));
	return 0;
}

int factF(int n)
{
	int i, fact=1;
	for(i=1; i<=n; i++)
	{
		fact = fact * i;
	}
	return fact;
}
int factR(int n)
{
	if(n==0 || n==1)
	{
		return 1;
	}
	else
	{
		return n*factR(n-1);
	}
}
