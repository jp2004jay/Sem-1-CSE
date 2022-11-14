#include<stdio.h>
int main()
{
	int n, counter=0,i=1;
	printf("Enter any number: ");
	scanf("%d", &n);
	while(i<=n)
	{
		if(n%i==0)
		{
			counter++;
		}
		i++;
	}
	if(counter == 2)
	{
		printf("Number is prime");
	}
	else 
	{
		printf("Number is not prime");
	}
	return 0;
}
