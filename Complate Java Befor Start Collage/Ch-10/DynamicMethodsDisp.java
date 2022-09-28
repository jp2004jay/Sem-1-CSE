package ch_10;
class Phone
{
	int a=5;
	
	public void greed()
	{
		System.out.println("Welcome To Phone");	
	}
	
	public void ring()
	{
		System.out.println("Ringing......");
	}
}

class SmartPhone extends Phone
{
	@Override
	public void greed()
	{
		System.out.println("Welcome To SmartPhone");	
	}
	
	public void vibreat()
	{
		System.out.println("Vibreating......");
	}
}

class GlassPhone extends SmartPhone
{
	@Override
	public void greed()
	{
		System.out.println("Welcome To GlassPhone");	
	}
}

public class DynamicMethodsDisp
{
	public static void main(String [] args)
	{
			System.out.println("Welcome To Dynamic Memory Dispatch");
		
			Phone nokia = new Phone();
			nokia.greed();
			nokia.ring();
			//nokia.vibreat(); --> Cannot Call This Method To Reference Phone Class
		
			Phone samsang = new SmartPhone();
			samsang.greed();
			samsang.ring();
			//samsang.vibreat(); --> Cannot Call This Method To Reference Phone Class
		
			Phone apple = new GlassPhone();
			apple.greed();
			apple.ring();
			//apple.vibreat(); --> Cannot Call This Method To Reference Phone Class
			
	}
}