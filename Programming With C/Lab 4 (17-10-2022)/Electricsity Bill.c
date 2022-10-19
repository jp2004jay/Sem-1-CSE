#include<stdio.h>
int main()
{
	int unit;
	double prise, billAmount;
	
	printf("Enter Unit Of Electricity Bill: ");
	scanf("%d", &unit);
	
	if(unit<=50)
	{
		prise=unit*0.50;
	}
	else if(unit<=150)
	{
		prise=(50*0.50)+(unit-50)*0.75;
	}
	else if(unit<=250)
	{
		prise=(50*0.50)+(100*0.75)+(unit-150)*1.20;
	}
	else
	{
		prise=(50*0.50)+(100*0.75)+(100*1.20)+(unit-250)*1.50;
	}
	
	billAmount = prise + (prise*0.20);
	
	printf("Your Bill Of %d Unit Is %.2lf", unit, billAmount); 
	
	return 0; 
}
