package ch_11;
abstract class Pen
{
		abstract void write();
		abstract void refill();
}

class FountainPen extends Pen
{
	public void changeNib()
	{
		System.out.println("You Can Change Nib Of Pen In 500 Rupees Only!");
	}
	
	public void write()
	{
		System.out.println("You Are Writing... ");
	}
	
	public void refill()
	{
		System.out.println("You Can Change Refill Of This Pen In 100 Rupees Only!");
	}
}

public class EmplementPenWithAbstrect
{
	public static void main(String [] args)
	{
		System.out.println("Welcome To Abstract Class And Methods.\n");
		
		//Pen p1=new Pen();
		//p1.write();
		
		FountainPen f1= new FountainPen();
		f1.write();
		f1.refill();
		f1.changeNib();
	}
}