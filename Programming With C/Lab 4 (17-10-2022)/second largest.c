#include<stdio.h>
int main()
{
	int a, b, c;
	printf("Enter value of a, b, c is: ");
	scanf("%d %d %d", &a, &b, &c);
	
	if(a>b && a>c)
	{
		if(b>c)
		{
			printf("B is Second Largest");	
		}
		else
		{
			printf("C is Second Largest");
		}
	}
	else
	{
		if(b>c)
		{
			if(c>a)
			{
				printf("C is Second Largest");
			}
			else 
			{
				printf("A is Second Largest");
			}
		}
		else
		{
			if(a>b)
			{
				printf("A is Second Largest");
			}
			else 
			{
				printf("B is Second Largest");
			}
		}
	}
	return 0;
}
