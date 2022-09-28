package ch_11;
abstract class Telephone
{
	public void ring()
	{
		System.out.println("Ringing......");
	}
	
	public void lite(int a)
	{
		System.out.println("Briteness Level Are "+a+"%");
	}
	
	abstract public void disconnect();
}

class SmartPhone1 extends Telephone
{
	public void disconnect()
	{
		System.out.println("Disconnecting Your Phone..");
	}
}

public class MakePhone
{
	public static void main(String [] args)
	{
		System.out.println("Welcome To New Generation Phone Like SmartPhone\n");
		
		System.out.println("Object Is Telephone And Reference Is SmartPhone Like Polymorphism");
		Telephone t1=new SmartPhone1();
		t1.ring();
		t1.lite(45);
		t1.disconnect();
	}
}