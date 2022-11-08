#include<stdio.h>
int main()
{
	int i=1;
	char chU = 'A', chL = 'a';
	while(i<=26)
	{
		printf("%c ", chU++);
		printf("%c \n", chL++);
		i++;
	}
	return 0;
}
