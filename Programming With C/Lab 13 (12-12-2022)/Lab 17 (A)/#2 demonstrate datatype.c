#include<stdio.h>
int main()
{
	int n1, *pn1;
	float n2, *pn2;
	double n3, *pn3;
	char n4, *pn4;
	
	n1=23;
	n2=34.45;
	n3=234.457687878;
	n4='c';
	
	pn1=&n1;
	pn2=&n2;
	pn3=&n3;
	pn4=&n4;
	
	printf("\nValue of integer: %d", n1);
	printf("\nAddress of integer: %d\n", pn1);
	
	printf("\nValue of float: %f", n2);
	printf("\nAddress of float: %d\n", pn2);
	
	printf("\nValue of double: %lf", n3);
	printf("\nAddress of double: %d\n", pn3);
	
	printf("\nValue of char: %c", n4);
	printf("\nAddress of char: %d\n", pn4);
	
	
}
