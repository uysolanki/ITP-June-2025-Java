package day6;

public class DriverApp2 {

	public static void main(String[] args) {
		Numeric thread1=new Numeric();
		CapAlpha thread2=new CapAlpha();
		SmallAlpha thread3=new SmallAlpha();
		
	
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
