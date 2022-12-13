#include<stdio.h>

float findMax(float, float, float);
int main()
{
	float a, b, c;
	printf("Enter value of a it's floating: ");
	scanf("%f", &a);
	
	printf("Enter value of b it's floating: ");
	scanf("%f", &b);
	
	printf("Enter value of c it's floating: ");
	scanf("%f", &c);
	
	printf("Max is: %f", findMax(a,b,c));
}

float findMax(float a, float b, float c)
{
	if(a>b)
	{
		if(a>c)
		{
			return a;
		}
		else
		{
			return c;
		}
	}
	else
	{
		if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}
