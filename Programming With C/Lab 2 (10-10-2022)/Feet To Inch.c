#include<stdio.h>
int main()
{
	float inch, feet;
	printf("Enter feet: ");
	scanf("%f", &feet);
	inch = 12.0f * feet;
	printf("Your inches is: %f",inch);
	return 0;
}
