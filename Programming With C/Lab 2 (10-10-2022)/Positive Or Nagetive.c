#include<stdio.h>
int main()
{
	int number;
	printf("Enter Any Number: ");
	scanf("%d", &number);
	
	if(number==0)
	{
		printf("Number is Zero");
	}
	
	else if(number<0)
	{
		printf("Number is Nagetive");
	}
	
	else 
	{
		printf("Number is Positive");
	}
	return 0;
}
