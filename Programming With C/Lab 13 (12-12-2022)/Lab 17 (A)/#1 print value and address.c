#include<stdio.h>
int main()
{
	int a, *p;
	a=34;
	p=&a;
	
	printf("Value of a is: %d", a);
	printf("\nAddress of a is: %d", p);
}
