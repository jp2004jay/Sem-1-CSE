#include<stdio.h>
int main()
{
	int number, digit;
	printf("Enter Any Integer Number: ");
	scanf("%d", &number);
	
	digit = number % 10;
	
	if(digit%2 == 0)
	{
		printf("Last digit of your number is even.");
	}
	else
	{
		printf("Last digit of your number is odd.");
	}
	return 0;
}
