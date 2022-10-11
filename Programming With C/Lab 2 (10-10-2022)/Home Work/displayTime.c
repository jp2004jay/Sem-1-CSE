#include<stdio.h>
#include<time.h>

void main()
{
    time_t t = time(NULL);
    printf("Current date and time is : %s", ctime(&t));
}
