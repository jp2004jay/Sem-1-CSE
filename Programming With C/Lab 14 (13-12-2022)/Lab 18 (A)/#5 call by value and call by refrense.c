#include<stdio.h>

void swapV(int, int);
void swapR(int*, int*);

int main()
{
	int a, b;
	
	printf("Enter Value of a: ");
	scanf("%d", &a);
	printf("Enter Value of b: ");
	scanf("%d", &b);
	
	swapV(a,b);
	printf("\nUsing call by value a is: %d", a);
	printf("\nUsing call by value b is: %d", b);
	
	swapR(&a, &b);
	printf("\n\nUsing call by refrense a is: %d", a);
	printf("\nUsing call by refrense b is: %d", b);
}
void swapV(int a, int b)
{
	int temp = a;
	a = b;
	b = temp;
}

void swapR(int *a, int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
