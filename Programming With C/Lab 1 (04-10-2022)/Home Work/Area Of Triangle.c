#include<stdio.h>
int main()
{
	float base, height, area;
	
	printf("Enter Base: ");
	scanf("%f", &base);
	
	printf("Enter Height: ");
	scanf("%f", &height);
	
	area = 0.5f*base*height;
	printf("Area is: %f", area);
}
