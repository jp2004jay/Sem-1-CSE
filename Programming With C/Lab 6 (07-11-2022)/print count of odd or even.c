#include<stdio.h>
int main()
{
	int i=1, n, evenCount=0, oddCount=0;
	while(i<=10)
	{
		printf("Enter a number: ");
		scanf("%d", &n);
		if(n%2==0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
		i++;
	}
	printf("Your Odd Numbers Count: %d\n", oddCount);
	printf("Your Even Numbers Count: %d", evenCount);
	return 0;
}
