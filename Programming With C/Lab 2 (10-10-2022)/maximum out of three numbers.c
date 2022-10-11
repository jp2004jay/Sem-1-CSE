#include<stdio.h>
int main()
{
	int a, b, c;
	printf("Enter Number Of A is: ");
	scanf("%d", &a);
	printf("Enter Number Of B is: ");
	scanf("%d", &b);
	printf("Enter Number Of C is: ");
	scanf("%d", &c);
	
	if(a>b)
	{
		if(a>c)
		{
			printf("A is Max");
		}
		else
		{
			printf("C is Max");
		}
	}
	
	else
	{
		if(b>c)
		{
			printf("B is Max");
		}
		else
		{
			printf("C is Max");
		}
	}
	return 0;
}
