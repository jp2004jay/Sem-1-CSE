package project;

import java.lang.Math;

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
	
	public void cylinderPrint()
	{
		System.out.println("\nCylinder Calculation");
	}
	
	public void print(float r, float h)
	{
		radius=r;
		height=h;
		
		System.out.println("Area             : "+area(r, h));
		System.out.println("Surface Area : "+surfaceArea(r, h));
		System.out.println("Volume         : "+volume(r, h));
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
		System.out.println("\nCone Calculation");
		print(r, h);
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

class Hemisphere extends Sphere
{
	public Hemisphere(float r)
	{
		super (r);
		
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
	
	@Override
	public float surfaceArea(float r)
	{
		return 3*pI*r*r;
	}
	
	@Override
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
	
		public static void main(String [] args)
	{
		System.out.println("\nWelcome To Calculate Area, Surface Area & Volume");
			
		Cuboid cuboid=new Cuboid (2f, 8f, 3f);   //First==Length, Second==Breath, Third==Height
		
		Cube cube=new Cube (2f);   //This is Side
		
		Cylinder cylinder = new Cylinder ();		//First==Radius, Second==Height
		cylinder.cylinderPrint();
		cylinder.print(5f, 2f);
		
		Cone cone = new Cone (5f, 2f);   //First==Radius, Second==Height
		
		Sphere sphere=new Sphere (3f);   //This is Radius
		
		Hemisphere hemisphere =new Hemisphere(5f);   //This is Radius	
		
		Frustum frustum = new Frustum(2d, 5d, 8d); //First==Radius-1 , Second==Radius-2, Third==Height
	}
}