#include<stdio.h>
#include<string.h>

struct Student
{
	char name[32];
	float per;
	int age;	
};

int main()
{
	struct Student student[5];
	
	strcpy(student[0].name, "Aayush");
	student[0].per = 56.45;
	student[0].age = 23;
	
	strcpy(student[1].name, "Param");
	student[1].per = 78.98;
	student[1].age = 34;
	
	strcpy(student[2].name, "Tushar");
	student[2].per = 67.45;
	student[2].age = 12;
	
	strcpy(student[3].name, "Madho");
	student[3].per = 23.34;
	student[3].age = 28;
	
	strcpy(student[4].name, "Rajesh");
	student[4].per = 68.35;
	student[4].age = 45;
	
	int i;
	for(i=0; i<5; i++)
	{
		printf("\n\nName\t\t: %s \nPersentage\t: %.2f \nAge\t\t: %d", student[i].name, student[i].per, student[i].age);
	}
}
