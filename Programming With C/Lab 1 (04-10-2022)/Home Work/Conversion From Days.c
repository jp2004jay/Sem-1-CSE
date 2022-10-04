#include<stdio.h>
int main()
{
	int daysIn, years, months, weeks, days, reminder1, reminder2;
	
	printf("Enter Days: ");
	scanf("%d", &daysIn);
	
	years = daysIn/365;
	reminder1 = daysIn%365;
	months = reminder1/30;
	reminder2 = reminder1%30;
	weeks = reminder2/7;
	days = reminder2%7;
	
	/*years = daysIn/365;
	months = (daysIn-years*365)/30;
	days = daysIn-(years-365)-(months*30);*/
	
	printf("Years %d, Months %d, Weeks %d, Days %d", years, months, weeks, days);
}
