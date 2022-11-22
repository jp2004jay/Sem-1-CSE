#include<stdio.h>
int main()
{
	int i, fact=1, n=8;
	float answer=1;
	for(i=1; i<=n; i++)
	{
		fact = fact*i;
		answer = answer + (float)1/fact;
	}
	printf("%f", answer);
}
