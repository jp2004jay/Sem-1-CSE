#include<stdio.h>
int main()
{
	int i, count=1;
	char name[] = "Ramani Jay";
	char charFind;
	
	printf("Enter any charctor to find in string: ");
	scanf("%c", &charFind);
	
	for(i=0; name[i]!='\0'; i++)
	{
		if(name[i] == charFind)
		{
			printf("\nYour charctor is %c in [%d] index", name[i], i);
			count = 0;
		}
	}
	
	if(count)
	{
		printf("Your charctor not found");
	}
	printf("\nYour string is: ");
	for(i=0; name[i]!='\0'; i++)
	{
		printf("%c",name[i]);
	}
}
