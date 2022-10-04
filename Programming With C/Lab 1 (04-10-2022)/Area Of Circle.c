#include<stdio.h>
#define pI 3.14

int main()
{
	float r, area;
	printf("Enter Radius: ");
	scanf("%f", &r);
	area=pI*r*r;
	printf("Area Of Circle is: %f", area);
	return 0;
}
