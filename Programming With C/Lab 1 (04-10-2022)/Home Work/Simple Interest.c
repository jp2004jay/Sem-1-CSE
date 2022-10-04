#include<stdio.h>
int main()
{
	float p, r, n, amount;
	printf("Enter Principal: ");
	scanf("%f", &p);
	
	printf("Enter Rate: ");
	scanf("%f", &r);
	
	printf("Enter Years: ");
	scanf("%f", &n);
	
	amount=(p*r*n)/100.0f;
	
	printf("Calculate Simple Interest %f", amount);
	
}
