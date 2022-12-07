#include<stdio.h>
int main()
{
	int i,j, n, a[32], count=0;
	printf("How many elements do you enter?: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter element of %d index ", i);
		scanf("%d", &a[i]);
	}
	
	for(i=0; i<n; i++)
	{		
		for(j=i+1; j<n; j++)
		{
			if(a[i]==a[j])
			{
				count++;
				break;
			}
		}
	}
	printf("Duplicats elements are %d", count);
}
