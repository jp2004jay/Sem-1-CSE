package Ch_13;
class MyThread1 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<250)
		{
			System.out.println("Welcome!");
			i++;
		}
	}
}

class MyThread2 implements Runnable
{
	public void run()
	{
		int i=0;
		while (i<250)
		{
			System.out.println("Good Morning");
			i++;
		}	
	}
}
public class ThreadEx_1_And_2
{
	public static void main(String [] args)
	{
		MyThread1 t1 = new MyThread1();
		Thread thread1 = new Thread(t1);
		
		try
		{
			thread1.sleep(200);
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		
		thread1.setPriority(4);
		thread1.getPriority();
		
		MyThread2 t2 = new MyThread2();
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
	}
}