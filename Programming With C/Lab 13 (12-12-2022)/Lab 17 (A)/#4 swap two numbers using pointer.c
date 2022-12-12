#include<stdio.h>
int main()
{
	int a, b, *pa, *pb, temp;
	
	printf("Enter value of a is: ");
	scanf("%d", &a);
	
	printf("Enter value of b is: ");
	scanf("%d", &b);
	
	pa=&a;
	pb=&b;
	
	temp = *pa;
	*pa = *pb;
	*pb = temp;
	
	printf("\nValue of a is: %d", *pa);
	printf("\nValue of b is: %d", *pb);
}
