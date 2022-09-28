package ch_11;
interface BasicAnimal
{
	void eat();
	void sleep();
}

class Monkey implements BasicAnimal 
{
	public void jump()
	{
		System.out.println("Jumping......");
	}
	
	public void bite()
	{
		System.out.println("Biting......");
	}
	
	public void eat()
	{
		System.out.println("Eating Food Anywhere");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping Anywhere");
	}
}

class Human extends Monkey
{
	public void read()
	{
		System.out.println("Reading......");
	}
	
	public void write()
	{
		System.out.println("Writing......");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Sleep Only For At Home On The Bad");
	}
}

public class Hummanities
{
		public static void main(String [] args)
	{
		System.out.println("Welcome to hummanities level throw out monkey.\n");
		
		System.out.println("This is a Monkey!");
		Monkey m1 = new Monkey();
		m1.jump();
		m1.bite();
		m1.eat();
		m1.sleep();
		
		System.out.println("\nThis is a Human!");
		Human h1 = new Human();
		h1.jump();
		h1.bite();
		h1.read();
		h1.write();
		h1.eat();
		h1.sleep();
		
		System.out.println("\nThis is a Human! And Object Is Monkey Like Polymorphism");
		Monkey mAh =new Human();
		mAh.jump();
		mAh.bite();
		//mAh.read(); --> Personal For Human!
		//mAh.write(); --> Personal For Human!
		mAh.eat();
		mAh.sleep();
		
		
	}
}