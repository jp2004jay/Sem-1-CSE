#include<stdio.h>
int main()
{
	float fahrenheit, celsius;
	
	printf("Enter Fahrenheit: ");
	scanf("%f", &fahrenheit);
	
	celsius = (fahrenheit-32)*5.0f/9.0f;
	
	printf("Celsius is: %f", celsius);
	return 0;
}
