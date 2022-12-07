#include<stdio.h>
int main()
{
	int i, a[32], n, sum=0, ave=0, count=0;
	
	printf("How many elements do you enter?: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter element of %d index: ",i);
		scanf("%d", &a[i]);
		sum = sum + a[i];
	}
	
	ave = sum/n;
	
	for(i=0; i<n; i++)
	{
		if(a[i]>ave)
		{
			count++;
		}
	}
	
	printf("\nAverage is: %d", ave);
	printf("\n%d elements are higher than the average", count);
	return 0;
}
