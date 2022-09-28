package ch_8;
class Cellphone
{
	public void ring()
	{
		System.out.println("Ringing......");
	}
	public void vibreat()
	{
		System.out.println("Vibreating......");
	}
	public void callFriend()
	{
		System.out.println("Calling Tushar..........");
		vibreat();
		ring();
	}
}

class Tommy
{
	public void hit()
	{
		System.out.println("Hitting......");
	}
	public void run()
	{
		System.out.println("Running......");
	}
	public void fire()
	{
		System.out.println("Firing......");
	}
	public void callTommy()
	{
		System.out.println("Welcome Tommy...");
		run();
		hit();
		fire();
	}
}

public class Cellphone_Game
{
		public static void main(String [] args)
	{
		System.out.println("Welcome to class & Methods\n");
		
		Cellphone phone = new Cellphone();
		phone.callFriend();
		
		System.out.println("\n");
		
		Tommy tm =new Tommy();
		tm.callTommy();
	}
}