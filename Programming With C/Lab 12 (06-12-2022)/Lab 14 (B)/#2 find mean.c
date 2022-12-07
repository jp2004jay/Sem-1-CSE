#include<stdio.h>
#include<math.h>
int main()
{
	int i;
	float n, a[32], sum=0, geometricFirst=1;
	float ave=0, geometric=0, harmonicFirst=0, harmonic=0;
	printf("How many elements do you enter? : ");
	scanf("%f", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter element of %d index: ", i);
		scanf("%f", &a[i]);
		sum = sum + a[i];
		geometricFirst = geometricFirst * a[i];
		harmonicFirst = harmonicFirst + (1/a[i]);
	}
	ave = sum/n;
	geometric = pow(geometricFirst,(1/n));
	harmonic = n/harmonicFirst;
	
	printf("Average mean is: %f \nGeometric mean is: %f \nHarmonic mean is: %f", ave, geometric, harmonic);
	
}
