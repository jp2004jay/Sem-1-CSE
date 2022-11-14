#include<stdio.h>
int main()
{
	int number, digit=0, reverseNumber=0;
	printf("Enter any number: ");
	scanf("%d", &number);
	while(number!=0)
	{
		digit = number%10;
		number = number/10;
		reverseNumber = digit+reverseNumber*10;
	}
	printf("Reverse number is: %d", reverseNumber);
	return 0;
}
