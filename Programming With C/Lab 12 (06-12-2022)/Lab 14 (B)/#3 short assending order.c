#include<stdio.h>
int main()
{
	int i,j, n, a[32], temp=0;
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
			if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for(i=0; i<n; i++)
	{
		printf("%d\n",a[i]);
	}
	//printf("Duplicats elements are %d", count);
}
