#include<stdio.h>
int factoial(int n);
int main()
{
	int i,j,k,n=6, answer=1;
	for(i=0; i<=n-1; i++)
	{
		for(k=1; k<n-i+1; k++)
		{
			printf(" ");
		}
		for(j=0; j<=i; j++)
		{
			answer = factorial(i)/(factorial(j)*factorial(i-j));
			printf("%d ",answer);
		}
		printf("\n");
	}
}

int factorial(int n)
{
	int i, fact=1;
	for(i=1; i<=n; i++){
		fact = fact*i;
	}
	return fact;
}
