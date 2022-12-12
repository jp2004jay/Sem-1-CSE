#include<stdio.h>
int main()
{
	int a, b, *pa, *pb, sum;
	printf("Enter value of a is: ");
	scanf("%d", &a);
	pa=&a;
	
	printf("Enter value of b is: ");
	scanf("%d", &b);
	pb=&b;
	
	sum = *pa + *pb;
	
	printf("Sum of a and b is: %d", sum);
}
