#include<stdio.h>
int main()
{
	float red, green, blue, white, c, m, y, k;
	printf("Enter \"R G B\" format: RED, GREEN, BLUE (limit 0-255)");
	scanf("%f %f %f", &red, &green, &blue);
	
	if(red==0 && blue==0 && green==0)
	{
		printf("Your \"C M Y K\" format is: 0 0 0 1");
	}
	
	else if(red>255 || red<0 || green>255 || green<0 || blue>255 || blue<0)
	{
		printf("Please Enter Valid Input");
	}
	
	else
	{
		if(red>green && red>blue)
		{
			white = red/255.0f;
		}
		else
		{
			if(green>blue)
			{
				white = green/255.0f;
			}
			else
			{
				white = blue/255.0f;
			}
		}	
		
		c = (white - red/255)/white;
		m = (white - green/255)/white;
		y = (white - blue/255)/white;
		k = 1-white;
		
		printf("Your \"C M Y K\" format is: %f %f %f %f", c, m, y, k);
	}
	return 0;
}
