#include<stdio.h>
int main()
{
	int a, b, add, sub, mul, div;
	char ch;
	
	printf("Enter any one of: +, -, *, /: ");
	scanf("%c", &ch);
	
	if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
	{
		printf("Enter Value of A is: ");
		scanf("%d", &a);
	
		printf("Enter Value of B is: ");
		scanf("%d", &b);
		
		if(ch == '+')
		{
			add = a+b;
			printf("Your Addition is: %d", add);
		}
	
		else if(ch == '-')
		{
			sub = a-b;
			printf("Your Substration is: %d", sub);
		}
	
		else if(ch == '*')
		{
			mul = a*b;
			printf("Your Multiply is: %d", mul);
		}
	
		else if(ch == '/')
		{
			div = a/b;
			printf("Your Divided is: %d", div);
		}
	
	}
	else
	{
		printf("Please enter +, -, * or / only! \n");
	}	
	
	return 0;
}
