#include<stdio.h>
int main()
{
	int i=1, total, num;
	printf("Enter Any Number: ");
	scanf("%d", &num);
	
	while(i<=10)
	{
		printf("%d x %d = %d\n", num, i, num*i);
		i++;
	}
	return 0;
}
