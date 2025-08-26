package day6;

public class Numeric extends Thread
{
@Override
public void run() {
	for(int i=1;i<=26;i++)
	{
		System.out.println(i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}

@Override
public void start()
{
	System.out.println("Hi");
	super.start();
}


//public void run(int r) {
//	for(int i=100;i<=126;i++)
//	{
//		System.out.println(i);
//	}
//}
}
