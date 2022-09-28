package ch_8;
class Squre
{
	int side;
	
	public int area(int side)
	{
		return side*side;
	}
	
	public int parimeters(int side)
	{
		return 4*side;
	}
	public void printSqure()
	{
		System.out.println(area(side));
		System.out.println(parimeters(side));
	}
}

class Rectangle
{
	int length;
	int breath;
		
	public int areaR(int length, int breath)
	{
			return length * breath;
	}
	public int parimetersR(int length, int breath)
	{
			return 2*(length+breath);
	}
	public void printRectange()
	{
			System.out.println(areaR(length, breath));
			System.out.println(parimetersR(length, breath));
	}
}

class Circle
{
	float radius;
	float pI=3.14f;
	
	public float areaC(float radius)
	{
		return pI*radius*radius;
	}
	public float parimetersC(float radius)
	{
		return 2*pI*radius;
	}
	public void printCircle()
	{
		System.out.println(areaC(radius));
		System.out.println(parimetersC(radius));
	}
}

public class Squre_Rectangal_Circle
{
		public static void main(String [] args)
	{
		System.out.println("Area And Parimeters Of Squre");
		Squre s1=new Squre();
		s1.side=3;
		s1.printSqure();
		
		System.out.println("\nArea And Parimeters Of Rectangle");
		Rectangle r1=new Rectangle();
		r1.length=3;
		r1.breath=2;
		r1.printRectange();
		
		System.out.println("\nArea And Parimeters Of Circle");
		Circle c1=new Circle();
		c1.radius=3;
		c1.printCircle();
		
	}
}