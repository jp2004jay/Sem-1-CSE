#include<stdio.h>
int main()
{
	int s1, s2, s3, s4, s5;
	float ave;
	printf("Enter marks of english: ");
	scanf("%d", &s1);
	printf("Enter marks of maths: ");
	scanf("%d", &s2);
	printf("Enter marks of physics: ");
	scanf("%d", &s3);
	printf("Enter marks of chemistry: ");
	scanf("%d", &s4);
	printf("Enter marks of biology: ");
	scanf("%d", &s5);
	
	ave = (s1+s2+s3+s4+s5)/5;
	
	if(ave<35)
	{
		printf("You are fail.");
	}
	
	else if (ave>=35 && ave<45)
	{
		printf("Class: Pass Class");
	}
	
	else if (ave>=45 && ave<60)
	{
		printf("Class: Second Class");
	}
	
	else if (ave>=60 && ave<70)
	{
		printf("Class: First Class");
	}
	else if (ave>=70)
	{
		printf("Class: Distinction");
	}
	
	return 0;
}
