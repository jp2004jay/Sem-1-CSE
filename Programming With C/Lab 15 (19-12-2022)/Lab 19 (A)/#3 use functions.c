#include<stdio.h>
#include<string.h>

int main()
{
	char str1 [] = "This is my book";
	char str2 [] = "My book is very nice";
	
	char str3 [] = "This is my book";
	char str4 [] = "My book is very nice";
	
	char str5 [] = "This is my book";
	char str6 [] = "My book is very nice";
	
	printf("\nLength of str1 is: %d",strlen(str1));
	printf("\nLength of str2 is: %d",strlen(str2));
	
	printf("\n\nCompare two string: %d", strcmp(str1, str2));//output 0 for same string either 1.
	
	printf("\n\nReverce: %s", strrev(str1));
	printf("\n\nLower Case: %s", strlwr(str2));
	printf("\n\nUpper Case: %s", strupr(str2));
	
	printf("\n\nConcatinate is: %s", strcat(str3, str4));
	
	printf("\n\nString copy for 1st in 2nd: %s", strcpy(str5, str6));
	
}
