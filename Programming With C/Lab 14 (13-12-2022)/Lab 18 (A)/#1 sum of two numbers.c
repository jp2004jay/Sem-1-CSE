#include<stdio.h>

int sumOfTwo(int, int);
int main()
{
	int a, b, sum;
	printf("Enter value of a: ");
	scanf("%d", &a);
	printf("Enter value of b: ");
	scanf("%d", &b);
	sum=sumOfTwo(a,b);
	printf("Sum is: %d",sum);
}
int sumOfTwo(int a, int b)
{
	return a+b;
}
