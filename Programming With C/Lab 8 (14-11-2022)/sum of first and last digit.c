#include<stdio.h>
int main()
{
	int number, firstDigit=0, lastDigit=0, sum=0;
	printf("Enter any number: ");
	scanf("%d", &number);
	
	lastDigit=number%10;
	
	while(number!=0)
	{
		firstDigit = number%10;
		number = number/10;		
	}
	
	sum=firstDigit+lastDigit;
	printf("Sum of first and last digit is: %d",sum);
	return 0;
}
