#include<stdio.h>
int main()
{
	int base, exponants, answer=1;
	printf("Enter Base: ");
	scanf("%d", &base);
	printf("Enter Exponants: ");
	scanf("%d", &exponants);
	for(; exponants>0; exponants--)
	{
		answer=base*answer;
	}
	printf("Answer is: %d", answer);
}
