#include<stdio.h>

double findSimple(int, float, int);
int main()
{
	int p, n;
	float r;
	printf("Enter principal: ");
	scanf("%d", &p);
	printf("Enter rate: ");
	scanf("%f", &r);
	printf("Enter year of: ");
	scanf("%d", &n);
	printf("Simple intrest is: %lf",findSimple(p,r,n));
}
double findSimple(int p, float r, int n)
{
	double intrest;
	intrest=(double)p*r*n/100;
	
	return intrest;
}
