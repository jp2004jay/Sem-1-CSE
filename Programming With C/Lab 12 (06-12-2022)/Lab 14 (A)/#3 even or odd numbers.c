#include<stdio.h>
int main()
{
	int i, a[32], n, evenC=0, oddC=0;
	
	printf("How many element do you enter? : ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("\nEnter element of %d: ", i);
		scanf("%d", &a[i]);
		if(a[i]%2==0)
		{
			evenC++;
		}
		else
		{
			oddC++;
		}
	}
	printf("\nEven Numbers Are %d",evenC);
	printf("\nOdd Numbers Are %d",oddC);	
}
