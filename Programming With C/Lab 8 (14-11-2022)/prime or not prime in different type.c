#include<stdio.h>
int main()
{
	int n, i=2, flag=0;
	printf("Enter any number: ");
	scanf("%d", &n);
	while(i<=n-1)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag == 0)
	{
		printf("Number is prime");
	}
	else 
	{
		printf("Number is not prime");
	}
	return 0;
}
