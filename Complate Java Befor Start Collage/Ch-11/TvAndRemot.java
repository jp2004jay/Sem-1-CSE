package ch_11;
interface TvRemot
{
	void light();
	void press();
}

interface SmartTvRemot extends TvRemot
{
	void click();
	void display();
}

class Tv implements SmartTvRemot
{
	public void light()
	{
		System.out.println("Tim.. Tim.. Tim.. (Red Color)");
	}
	
	public void press()
	{
		System.out.println("You Can Press Key Any One");
	}
	
	public void click()
	{
		System.out.println("You Can Click On Display");
	}
	
	public void display()
	{
		System.out.println("You Watch Display Is Very Clear After Click On Display");
	}
}

public class TvAndRemot
{
	public static void main (String [] args)
	{
		System.out.println("WelCome To Remot From TV Connnet To Smartly\n");
		Tv myTv= new Tv();
		myTv.press();
		myTv.light();
		myTv.click();
		myTv.display();
		
	}
}