#include<stdio.h>
int main()
{
	char ch;
	printf("Enter any charactor: ");
	scanf("%c", &ch);
	
	if(ch>=65 && ch<=90)
	{
		printf("You Enter Upper Case Charactor");
	}
	
	else if (ch>=97 && ch<=122)
	{
		printf("You Enter Lower Case Charactor");
	}
	
	else if(ch>=48 && ch<=57)
	{
		printf("You Enter a Digit");
	}
	
	else
	{
		printf("You Enter a Special Symbole");
	}
}
