#include<stdio.h>
int main()
{
	int i;
	char a[32];
	printf("Enter your name: ");
	scanf("%s", &a);
	
	for(i=0; a[i]!='\0'; i++)
	{
		printf("%c", a[i]);
	}
	printf("\nIndex of your name: %d", i);
}
