#include<stdio.h>
int main()
{
	int n, number, sum=0, i;
	float ave=0;
	printf("Enter number that you want to enter: ");
	scanf("%d", &n);
	i = n;
	while(n>0)
	{
		printf("Enter number: ");
		scanf("%d", &number);
		sum = sum + number;
		n--;
	}
	ave = (float)sum/i;
	printf("Sum is: %d\n",sum);
	printf("Average is: %.2f", ave);
	return 0;
}
