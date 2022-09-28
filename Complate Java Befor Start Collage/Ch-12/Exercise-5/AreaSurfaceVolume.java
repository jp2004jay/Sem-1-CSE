package project.classes;
import java.lang.Math;
import java.util.Scanner;

class Cuboid
{
	private float length, breath, height;
	
	public Cuboid(float l, float b, float h)
	{
		length=l;
		breath=b;
		height=h;
		
		System.out.println("\nCuboid Calculation");
		System.out.println("Area Of Cuboid             : "+area(l, b, h));
		System.out.println("Surface Area Of Cuboid : "+surfaceArea(l, b, h));
		System.out.println("Volume Of Cuboid         : "+volume(l, b, h));
	}
	
	public float area(float l, float b, float h)
	{
		return 2*h*(l+b);
	}
	
	public float surfaceArea(float l, float b, float h)
	{
		return 2*(l*b + b*h + h*l);
	}
	
	public float volume(float l, float b, float h)
	{
		return l*b*h;
	}
}

class Cube 
{
	private float side;
	
	public Cube(float a)
	{
		side=a;
		
		System.out.println("\nCube Calculation");
		System.out.println("Area Of Cube             : "+area(a));
		System.out.println("Surface Area Of Cube : "+surfaceArea(a));
		System.out.println("Volume Of Cube         : "+volume(a));
	}
	
	public float area(float a)
	{
		return 4*a*a;
	}
	
	public float surfaceArea(float a)
	{
		return 6*a*a;
	}
	
	public float volume(float a)
	{
		return a*a*a;
	}
	
}

class Cylinder 
{
	protected float radius, height;
	protected float pI=22.0f/7.0f;
	
	public void print(float r, float h)
	{
		radius=r;
		height=h;
		
		System.out.println("\nCylinder Calculation");
		System.out.println("Area Cylinder              : "+area(r, h));
		System.out.println("Surface Area Cylinder  : "+surfaceArea(r, h));
		System.out.println("Volume Cylinder          : "+volume(r, h));
	}
	
	public float area(float r, float h)
	{
		return 2*pI*r*h;
	}
	
	public float surfaceArea(float r, float h)
	{
		return 2*pI*r*(r+h);
	}
	
	public float volume(float r, float h)
	{
		return pI*r*r*h;
	}
	
}

class Cone extends Cylinder
{
	public Cone (float r, float h)
	{
		radius=r;
		height=h;
		
		System.out.println("\nCone Calculation");
		System.out.println("Area Cone              : "+area(r, h));
		System.out.println("Surface Area Cone  : "+surfaceArea(r, h));
		System.out.println("Volume Cone          : "+volume(r, h));
	}
	
	@Override
	public float area(float r, float h)
	{
		return pI*r*h;
	}
	
	@Override
	public float surfaceArea(float r, float h)
	{
		return 2*pI*r*(r+h);
	}
	
	@Override
	public float volume(float r, float h)
	{
		return 1.0f/3.0f*pI*r*r*h;
	}
}

class Sphere extends Cylinder
{
	public Sphere(float r)
	{
		radius=r;
		
		System.out.println("\nSphere Calculation");
		System.out.println("Area Of Sphere              : "+"Nothing");
		System.out.println("Surface Area Of Sphere  : "+surfaceArea(r));
		System.out.println("Volume Of Sphere          : "+volume(r));
	}
	
	public float surfaceArea(float r)
	{
		return 4.0f*pI*r*r;
	}
	
	public float volume(float r)
	{
		return 4.0f/3.0f*pI*r*r;
	}
}

class Hemisphere
{
	protected float radius;
	protected float pI=22.0f/7.0f;
	
	public Hemisphere(float r)
	{
		radius=r;
		
		System.out.println("\nHemisphere  Calculation");
		System.out.println("Area Of Hemisphere              : "+area(r));
		System.out.println("Surface Area Of Hemisphere  : "+surfaceArea(r));
		System.out.println("Volume Of Hemisphere          : "+volume(r));
	}
	
	public float area(float r)
	{
		return 2*pI*r*r;
	}
	
	public float surfaceArea(float r)
	{
		return 3*pI*r*r;
	}
	
	public float volume(float r)
	{
		return 2.0f/3.0f*pI*r*r;
	}
}

class Frustum
{
	private double radius1, radius2, height, length, beforeL;
	private double pI= 22.0f/7.0f;
	
	public Frustum(double r1, double r2, double h)
	{
		radius1=r1;
		radius2=r2;
		height=h;
		
		System.out.println("\nFrustum  Calculation");
		System.out.println("Area Of Frustum             : "+area(r1, r2, h));
		System.out.println("Surface Area Of Frustum : "+surfaceArea(r1, r2, h));
		System.out.println("Volume Of Frstum           : "+volume(r1, r2, h));
	}
	
	public double area(double r1, double r2, double h)
	{
		beforeL= h*h+((r1-r2)*(r1-r2));
		length=Math.sqrt(beforeL);
		
		return pI*(r1+r2)*length ;
	}
	
	public double surfaceArea(double r1, double r2, double h)
	{
		beforeL= h*h+((r1-r2)*(r1-r2));
		length=Math.sqrt(beforeL);
		
		return (pI*(r1+r2)*length) + (pI*r1*r1) + (pI*r2*r2);
	}
	
	public double volume(double r1, double r2, double h)
	{
		return 1.0d/3.0d*pI*h*((r1*r1) + (r2*r2) + (r1*r2)) ;
	}
}

public class AreaSurfaceVolume
{
	static int userIn()
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
	
		return num;
	}
	
	static float userInFunc(String s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The "+s+" :");
		float num = sc.nextFloat();
		return num;
	}
	
	public static void main(String [] args)
	{
		System.out.println("\nWelcome To Calculate Area, Surface Area & Volume");
		
		System.out.println("\nEnter 1 For Cuboid \nEnter 2 For Cube \nEnter 3 For Cylinder \nEnter 4 For Cone \nEnter 5 For Sphere \nEnter 6 For Hemisphere \nEnter 7 For Frustum");
	
		switch (userIn())
		{	
			case 1:
			{
				float f1, f2, f3;
				f1=userInFunc("Length");
				f2=userInFunc("Breath");
				f3=userInFunc("Height");
		
				Cuboid cuboid=new Cuboid (f1, f2, f3);   
				//First==Length, Second==Breath, Third==Height
			}break;
	
			case 2:
			{
				float f4;
				f4=userInFunc("Side");

				Cube cube=new Cube (f4);   
				//This is Side
			}break;

			case 3:
			{
				float f5, f6;
				f5=userInFunc("Radius");
				f6=userInFunc("Height");

				Cylinder cylinder = new Cylinder ();		
				//First==Radius, Second==Height
				cylinder.print(f5, f6);
			}break;
	
			case 4:
			{
				float f7, f8;
				f7=userInFunc("Radius");
				f8=userInFunc("Height");

				Cone cone = new Cone (f7, f8); 
				//First==Radius, Second==Height
			}break;
	
			case 5:
			{
				float f9;
				f9=userInFunc("Radius");

				Sphere sphere=new Sphere (f9);   
				//This is Radius
			}break;
	
			case 6:
			{
				float f10;
				f10=userInFunc("Radius");

				Hemisphere hemisphere =new Hemisphere(f10);   
				//This is Radius	
			}break;
	
			case 7:
			{
				float f11, f12, f13;
				f11=userInFunc("First Radius");
				f12=userInFunc("Second Radius");
				f13=userInFunc("Height");
		
				Frustum frustum = new Frustum(f11, f12, f13); 
				//First==Radius-1 , Second==Radius-2, Third==Height
			}break;
	
			default:
			{
				System.out.println("You Have Entered Invalid Number!");
			}
		}
	}
}