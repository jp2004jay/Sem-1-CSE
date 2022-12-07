#include<stdio.h>
int main()
{
	int i;
	char a[32];
	char copyA[32];
	
	printf("Enter your name: ");
	scanf("%s", &a);
	//gets(a);
	for(i=0; a[i]!='\0'; i++)
	{
		copyA[i]=a[i];
	}
	for(i=0; copyA[i]!='\0'; i++)
	{
		printf("%c", copyA[i]);
	}
}
