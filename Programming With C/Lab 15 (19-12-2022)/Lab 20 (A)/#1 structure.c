#include<stdio.h>
#include<string.h>
void print(int id, char name[], int salary);

struct Employee
{
	int id;
	char name[32];
	int salary;
};

int main()
{
	struct Employee e1, e2, e3;
	
	e1.id = 101;
	strcpy(e1.name, "Abhishek");
	e1.salary = 15000;
	
	e2.id = 102;
	strcpy(e2.name, "Bhargav");
	e2.salary = 25000;
	
	e3.id = 103;
	strcpy(e3.name, "Sandip");
	e3.salary = 30000;
	
	print(e1.id, e1.name, e1.salary);
	print(e2.id, e2.name, e2.salary);
	print(e3.id, e3.name, e3.salary);
}

void print(int id, char name[], int salary)
{
	static int i=1;
	printf("\n\nEmployee %d \nId = %d \nName = %s \nSalary = %d", i++, id, name, salary);
}
