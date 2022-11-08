#include<stdio.h>
int main()
{
	int n;
	
	printf("Enter 1 to 1000 number: ");
	scanf("%d", &n);
	
	if(n==0)
	{
		printf("Please don't enter ZERO");	
	}
	
	while(n!=0)
	{
		if(n>1000 || n<0)
		{
			n=0;
			printf("Please enter only 1 to 1000 and don't enter negative value'");
		}
		else if(n==1000)
		{
			n=0;
			printf("M");
		}
		else if(n>=900)
		{
			n = n%900;
			printf("CM");
		}
		else if(n>=500)
		{
			n = n%500;
			printf("D");
		}
		else if(n>=400)
		{
			n = n%400;
			printf("CD");
		}
		else if(n>=100)
		{
			if(n>=300)
			{
				printf("CC");
			}
			else if(n>=200)
			{
				printf("C");
			}
			n = n%100;
			printf("C");
		}
		else if(n>=90)
		{
			n = n%90;
			printf("XC");
		}
		else if(n>=50)
		{
			n = n%50;
			printf("L");
		}
		else if(n>=40)
		{
			n = n%40;
			printf("XL");
		}
		else if(n>=10)
		{
			if(n>=30)
			{
				printf("XX");
			}
			else if(n>=20)
			{
				printf("X");
			}
			
			n = n%10;
			printf("X");
		}
		else if(n>=9)
		{
			n = n%9; 
			printf("IX");
		}
		else if(n>=5)
		{
			n = n%5;
			printf("V");
		}
		else if(n>=4)
		{
			n = (n/4)-1;
			printf("IV");
		}
		else
		{
			n--;
			printf("I");
		}
	}
	printf("\n");
	printf("Exiting Programme");
	return 0;
}
