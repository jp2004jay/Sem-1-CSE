#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c,delta, r1, r2, real, img;
	printf("Enter Value of a, b, c: ");
	scanf("%d %d %d", &a, &b, &c);
	
	delta = (b*b)-(4*a*c);
	
	if(delta>0)
	{
		r1 = (-b+sqrt(delta))/2*a;
		r2 = (-b-sqrt(delta))/2*a;
		
		printf("R1 is: %d\n", r1);
		printf("R2 is: %d\n", r2);
	}
	else if(delta == 0)
	{
		r1 = -b/2*a;
		r2 = r1;
		
		printf("R1 is: %d\n", r1);
		printf("R2 is: %d\n", r2);	
	}
	else
	{
		real = -b/2*a;
		img = sqrt(delta)/2*a;
		
		printf("R1 is: %d + i%d\n", real, img);
		printf("R1 is: %d - i%d\n", real, img);
	}
	return 0;
}
