package Ch_13;
class Th1 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<200)
		{
				System.out.println("WelCome To Thread 1!");
				i++;
		}
	}
}

class Th2 extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		while(i<200)
		{
				System.out.println("Thread 2!");
				i++;
		}
	}
}

class Th3 implements Runnable
{
	@Override
	public void run()
	{
		int i=0;
		while(i<200)
		{
				System.out.println("WelCome To Thread 3! That Is Thread 3");
				i++;
		}
	}
}

class Th4 implements Runnable
{
	@Override
	public void run()
	{
		int i=0;
		while(i<200)
		{
				System.out.println("I am Thread 4!");
				i++;
		}
	}
}

public class ThreadWelcome
{
	public static void main(String [] args)
	{
		//System.out.println("Welcome To Thread");
		
		
		Th1 thread1 = new Th1();
		Th2 thread2 = new Th2();
		thread1.start();
		thread2.start();
	
		
		
		Th3 thread3 = new Th3();
		Thread xyz = new Thread(thread3);
		xyz.start();
		
		Th4 thread4 = new Th4();
		Thread xyz1 = new Thread(thread4);
		xyz1.start();
	
		
		
	}
}