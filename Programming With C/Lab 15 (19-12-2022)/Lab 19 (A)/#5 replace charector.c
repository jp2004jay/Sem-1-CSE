#include<stdio.h>
int main()
{
	int i, count=1;
	char name[] = "Ramani Jay";
	char charFind, charReplace;
	
	printf("Enter any two charctor to find and replace in string: ");
	scanf("%c %c", &charFind, &charReplace);
	
	for(i=0; name[i]!='\0'; i++)
	{
		if(name[i] == charFind)
		{
			name[i] = charReplace;
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
