#include<stdio.h>
int main()
{
	int a, b, temp;
	printf("Enter number of a is: ");
	scanf("%d", &a);
	printf("Enter number of b is: ");
	scanf("%d", &b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	printf("Number of a is: %d\n", a);
	printf("Number of b is: %d", b);
	return 0; 
}
