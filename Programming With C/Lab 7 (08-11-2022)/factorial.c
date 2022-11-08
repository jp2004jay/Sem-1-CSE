#include<stdio.h>

int main()
{
	int i=1, n, fact=1;
	printf("Enter any number: ");
	scanf("%d", &n);
	
	while(i<=n)
	{
		fact = i*fact;
		i++;
	}
	
	printf("%d", fact);
	return 0;
}
