#include<stdio.h>
int main()
{
	int i,a[32],n, search, count=0;
	printf("How many element do you enter? : ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("\nEnter element of %d: ", i);
		scanf("%d", &a[i]);
	}
	printf("\nWhich element do you search? :");
	scanf("%d", &search);
	
	for(i=0; i<n; i++)
	{
		if(search == a[i])
		{
			printf("Element of %d in index of %d", a[i], i);
			count = 1;
		}
	}
	if(count==0)
	{
		printf("No element found");
	}
	
}
