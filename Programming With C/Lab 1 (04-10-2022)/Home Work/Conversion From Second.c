#include<stdio.h>
int main()
{
	int secondIn, reminder, seconds, minutes, hours;
	
	printf("Enter Seconds: ");
	scanf("%d", &secondIn);
	
	hours = secondIn/3600;
	reminder = secondIn%3600;
	
	minutes = reminder/60;
	seconds = reminder%60;
	
	printf("Hours: %d, Minutes: %d, Seconds: %d", hours, minutes, seconds);
	return 0;
}
