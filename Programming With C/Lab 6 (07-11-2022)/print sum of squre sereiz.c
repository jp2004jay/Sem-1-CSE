#include<stdio.h>
int main()
{
	int i=1, squre=1, sumSqure=0, number;
	printf("Enter Any Number");
	scanf("%d", &number);
	while(i<=10){
		squre=i*i;
		sumSqure = sumSqure + squre;
		i++;
	}
	printf("Sum of 1+4+9+16...%d : %d", number, sumSqure);
	return 0;
}
