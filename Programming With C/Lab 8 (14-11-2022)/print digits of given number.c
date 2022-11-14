#include<stdio.h>
int main()
{
	int number, digit=0;
	printf("Enter any number: ");
	scanf("%d", &number);
	while(number!=0)
	{
		digit=number%10;
		number=number/10;
		printf("%d\n", digit);
	}
	return 0;
}
