#include<stdio.h>
#include<string.h>

struct Book
{
	char title[32];
	char author[32];
	double prise;
	
};

union Car
{
	char modal[32];
	double priseCar;	
};

int main()
{
	struct Book b1;
	union Car c1;
	
	strcpy(b1.title, "Let's C");
	strcpy(b1.author, "John Dave");
	b1.prise = 2300;
	
	strcpy(c1.modal, "Jeguar");
	c1.priseCar = 4500000;
	
	printf("Title\t: %s \nAuthor\t: %s \nPrise\t: %.0lf", b1.title, b1.author, b1.prise);
	printf("\n\nModal\t: %s \nPrise\t: %.0lf", c1.modal, c1.priseCar);
	printf("\n\nSize of Book is: %d", sizeof(b1));
	printf("\nSize of Car is: %d", sizeof(c1));
}
