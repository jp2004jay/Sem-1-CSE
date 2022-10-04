#include<stdio.h>
int main()
{
	float a, b, c, ave;
	printf("Enter First Number: ");
	scanf("%f", &a);
	
	printf("Enter Second Number: ");
	scanf("%f", &b);
	
	printf("Enter Third Number: ");
	scanf("%f", &c);
	
	ave=(a+b+c)/3;
	
	printf("Average is: %f", ave);
	return 0;
}
