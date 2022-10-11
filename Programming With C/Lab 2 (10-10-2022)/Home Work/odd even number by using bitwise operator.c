#include<stdio.h>
int main()
{
	int number;
	printf("Enter Any Number: ");
	scanf("%d", &number);
	
	if((number&1) == 0)
	{
		printf("Your number is even.");
	}
	else 
	{
		printf("Your number is odd.");
	}
	
	return 0;
}
