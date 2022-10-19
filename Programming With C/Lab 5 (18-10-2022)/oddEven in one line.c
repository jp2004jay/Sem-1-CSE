#include<stdio.h>
int main()
{
	int a;
	printf("Enter value of a is: ");
	scanf("%d", &a);
	(a%2 == 0)?printf("A is Even"):printf("A is Odd");
	return 0;
}
