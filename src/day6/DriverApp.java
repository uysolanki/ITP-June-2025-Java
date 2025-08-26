package day6;

public class DriverApp {

	public static void main(String[] args) {
		Numeric thread1=new Numeric();
		CapAlpha thread2=new CapAlpha();
		SmallAlpha thread3=new SmallAlpha();
		
		//thread1.run(99);
		
		thread3.start();
		thread3.start();
		
		Thread t2=new Thread(thread2);
		t2.start();
	}
}
