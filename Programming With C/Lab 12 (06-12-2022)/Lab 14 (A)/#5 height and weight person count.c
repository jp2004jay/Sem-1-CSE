#include<stdio.h>
int main()
{
	int i, height[5], weight[5], heightCount=0, weightCount=0;
	for(i=0; i<5; i++)
	{
		printf("Person %d \nEnter your height: ", i+1);
		scanf("%d", &height[i]);
		
		printf("Person %d \nEnter your weight: ", i+1);
		scanf("%d", &weight[i]);
		
		if(height[i]>170)
		{
			heightCount++;
		}
		if(weight[i]<50)
		{
			weightCount++;
		}
	}
	printf("\nPerson count of %d which height is grater than 170.", heightCount);
	printf("\nPerson count of %d which weight is less than 50.", weightCount);
	return 0;
}
