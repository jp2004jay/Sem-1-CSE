#include<stdio.h>
int main()
{
	int i,n, a[32], sum=0, max, min;
	float ave=0;
	printf("How many element do you enter? : ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("\nEnter element of %d: ", i);
		scanf("%d", &a[i]);
		sum = sum + a[i];
		
		if(a[i]>max)
		{
			max = a[i];
		}
		else 
		{
			min = a[i];
		}
		
	}
	ave=(float)sum/n;
	printf("\nTotal sum is: %d",sum);
	printf("\nAverage is: %f",ave);
	printf("\nMax is: %d",max);
	printf("\nMin is: %d", min);
}
