package Threading;
import java.io.*;

	
	class Thrd extends Thread
	{
	public void run()
	{
	 for(int i=1;i<=100;i++)
	{
	 System.out.println(i);
		   }
	   }
	}
	class Thrd1
	{
	 public static void main(String args[])
	{
	 Thrd obj=new Thrd();
	Thread t=new Thread(obj);
	t.start();
	}
	}



