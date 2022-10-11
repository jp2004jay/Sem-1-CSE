#include<stdio.h>
int main()
{
	int basicSalary, grossSalary, hRA, dA;
	printf("Enter Your Salary: ");
	scanf("%d", &basicSalary);
	
	if(basicSalary >= 30000)
	{
		hRA = basicSalary*0.30;
		dA = basicSalary*0.95;
	}
	
	else if(basicSalary >= 20000)
	{
		hRA = basicSalary*0.25;
		dA = basicSalary*0.90;
	}

	else if(basicSalary >= 10000)
	{
		hRA = basicSalary*0.20;
		dA = basicSalary*0.80;
	}
	
	else
	{
		basicSalary = 0;
		hRA = 0;
		dA = 0;
		printf("Please Enter Valid Salary\n");
	}
	
	grossSalary = basicSalary + hRA + dA;
	
	printf("Your Gross Salary is: %d", grossSalary);
	return 0;
	
}
