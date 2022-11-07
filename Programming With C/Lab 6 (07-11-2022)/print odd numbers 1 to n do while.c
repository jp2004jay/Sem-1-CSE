#include<stdio.h>
int main()
{
	int i=1, n;
	printf("Enter Any Numbers: ");
	scanf("%d", &n);
	do{
		if(i%2 != 0){
			printf("%d\n", i);
		}
		i++;
	}
	while(i<=n);
	return 0;
}
