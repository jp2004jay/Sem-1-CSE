#include<stdio.h>
int main()
{
	int x, y, i=1, answer=1;
	printf("Enter Base of x: ");
	scanf("%d", &x);
	printf("Enter Exponents of y: ");
	scanf("%d", &y);
	
	while(i<=y)
	{
		answer=x*answer;
		i++;
	}
	printf("%d", answer);
	return 0;
}
