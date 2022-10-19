#include<stdio.h>
int main()
{
	int a, b, c;
	printf("Enter Value of a, b, c is:");
	scanf("%d %d %d", &a, &b, &c);
	
	if(a==b && b==c && c==a)
	{
		printf("Tringle is Equilateral");
	}
	
	else if(a==b || b==c || c==a)
	{
		printf("Triangle is Isoceles");
	}
	else
	{
		printf("Triangle is Scalene");
	}
	return 0;
}
