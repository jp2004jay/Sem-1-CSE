#include<stdio.h>
int main()
{
	int month;
	printf("Enter any month 1 to 12: ");
	scanf("%d", &month);
	
	switch (month)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:printf("31 Days");
		break;
		case 4:case 6: case 9: case 11:printf("30 Days");
		break;
		case 2:printf("28 or 29 Days");
		break;
		default:printf("Enter only 1 to 12");
	}
	return 0;
}
