package day6;

public class CapAlpha extends Thread
{
@Override
public void run() {
	for(char ch='A'; ch<='Z';ch++)
	{
		System.out.println("\t" + ch);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
}
