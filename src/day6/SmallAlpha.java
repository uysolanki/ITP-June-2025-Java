package day6;

public class SmallAlpha extends Thread {
	@Override
	public void run() {
		for(char ch='a'; ch<='z';ch++)
		{
			System.out.println("\t\t"+ch);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
