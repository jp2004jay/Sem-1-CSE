#include<stdio.h>
int main()
{
	int i, number=1634, digit=0,nd=0,cn=0,j=0,td,sum=0;
	cn=number;
	while(number!=0)
	{
		digit = number%10;
		number = number/10;
		nd++;
	}
	number=cn;
	while(number!=0)
	{
		digit = number%10;
		td=1;
		for(j=1;j<=nd;j++){
			td=td*digit;
		}
		sum=sum+td;
		number = number/10;
	}
	if(cn==sum){
		printf("Armstrong");
	}
}
