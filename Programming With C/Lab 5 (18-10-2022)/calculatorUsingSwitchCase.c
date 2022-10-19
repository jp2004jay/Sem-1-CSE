#include<stdio.h>
int main()
{
	int a, b, sum, sub, mul, div;
	char ch;
	
	printf("Enter +, -, *, / : ");
	scanf("%c", &ch);
	
	printf("Enter value of a: ");
	scanf("%d", &a);
	
	printf("Enter value of b:");
	scanf("%d", &b);
	
	switch(ch){
	
	case '+': 
		sum = a+b;
		printf("Addition is: %d", sum);
	break;
	
	case '-':
		sub = a-b;
		printf("Substraction is: %d", sub);
	break;
	
	case '*':
		mul = a*b;
		printf("Multiplication is: %d", mul);
	break;
	
	case '/':
		div = a/b;
		printf("Division is: %d", div);
	break;
	
	default:
		printf("Please Enter only +, -, *, / ");
	}
	return 0;
}
