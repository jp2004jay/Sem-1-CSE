package ch_12;
class Parent
{
	protected int a=5;
	
	protected void greed()
	{
			System.out.println("Good Morning My Childs!");
	}
	
	private void privateTalk()
	{
			System.out.println("I Am Says Secrate Talk To My Best Child");
	}
	
	void allThe()
	{
			System.out.println("Take Lunch!");
	}
}

class Child extends Parent 
{
	void allMethods()
	{
		allThe();
		greed();
	}
	
}

public class ProveAccessModifires
{
		public static void main (String [] args)
	{
		System.out.println("Proving The Access Modifires");
		
		Parent p1 = new Parent();
		p1.greed();
		//p1.privateTalk(); --> This is show error.
		p1.allThe();
		System.out.println(p1.a);
		
		Child c1 = new Child();
		c1.greed();
		System.out.println(c1.a);
		
		//p1.privateTalk(); --> This is show error.
		c1.allThe();
		c1.allMethods();
	}
}