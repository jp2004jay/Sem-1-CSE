#include<stdio.h>
int main()
{
	int number, multiply, divided;
	printf("Enter any number: ");
	scanf("%d", &number);
	
	multiply = number << 1;
	divided = number >> 1;
	
	printf("Multiply by 2 is: %d\n",multiply);
	printf("Divided by 2 is: %d", divided);
	return 0;
}
