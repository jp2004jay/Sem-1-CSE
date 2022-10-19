#include<stdio.h>
int main()
{
	int a, b, c;
	printf("Enter value of a, b, c is: ");
	scanf("%d %d %d", &a, &b, &c);
	(a>b)?((a>c)?printf("A is max"):printf("C is max")):((b>c)?printf("B is max"):printf("C is max"));
	return 0;
}
