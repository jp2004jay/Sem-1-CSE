#include<stdio.h>
int main()
{
	int i,n, sum=0;
	printf("Enter a number that perfect or not: ");
	scanf("%d", &n);
	for(i=1; i<n; i++)
	{
		if(n%i == 0)
		{
			sum = sum+i;
		}
	}
	if(sum == n)
	{
		printf("Your number is perfect.");
	}
	else 
	{
		printf("Your number is not perfect.");
	}
}
