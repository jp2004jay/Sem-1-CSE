#include<stdio.h>
int main()
{
	int i=1;
	int n;
	int sum=0;
	
	printf("Enter Any Number: ");
	scanf("%d", &n);
	
	while(i<=n)
	{
		if(i%2==0)
		{
			sum = sum-i;
		}
		else
		{
			sum = sum+i;
		}
		i++;
	}
	printf("%d", sum);
	return 0;
}
