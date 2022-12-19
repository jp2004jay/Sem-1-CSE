#include<stdio.h>
#include<string.h>

void print(char t[], char a[], char p[], int pr);

struct Book
{
	char title[32];
	char author[32];
	char publication[10];
	int prise;	
};

int main()
{
	struct Book b1, b2, b3;
	
	strcpy(b1.title, "Let's C");
	strcpy(b1.author, "John Romanskar");
	strcpy(b1.publication, "11/02/2009");
	b1.prise = 400;
	
	strcpy(b2.title, "Website Hakes");
	strcpy(b2.author, "Mehta Jani");
	strcpy(b2.publication, "12/04/2002");
	b2.prise = 890;
	
	strcpy(b3.title, "Android Dummys");
	strcpy(b3.author, "Beni Sukal");
	strcpy(b3.publication, "31/03/1997");
	b3.prise = 230;
	
	print(b1.title, b1.author, b1.publication, b1.prise);
	print(b2.title, b2.author, b2.publication, b2.prise);
	print(b3.title, b3.author, b3.publication, b3.prise);
}

void print(char t[], char a[], char p[], int pr)
{
	static int i = 1;
	printf("\n\nBook %d \nTitle\t\t: %s \nAuthor\t\t: %s \nPublication\t: %s \nPrise\t\t: %d", i++, t, a, p, pr);
}
