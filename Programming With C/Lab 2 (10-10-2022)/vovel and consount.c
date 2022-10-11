#include<stdio.h>
int main()
{
	char ch;
	printf("Enter Any Charector: ");
	scanf("%c", &ch);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
	   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	   {
	   	printf("Your Charector is Vowel");
	   }
	
	else
	{
		printf("Your Charector is Consount");
	}
	return 0;
}
