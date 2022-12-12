#include<stdio.h>
int main()
{
	int i,j,a[20][2];
	for(i=0; i<20; i++)
	{
		for(j=0; j<2; j++)
		{
			if(j%2==0)
			{
				printf("Enter Rollno. of student-%d: ",i+1);
				scanf("%d", &a[i][j]);
			}
			else
			{
				printf("Enter Marks of rollno.: %d: ",a[i][j-1]);
				scanf("%d", &a[i][j]);
			}
		}
	}
}
