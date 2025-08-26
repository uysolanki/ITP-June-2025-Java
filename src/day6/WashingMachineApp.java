package day6;

public class WashingMachineApp {

	public static void main(String[] args) throws InterruptedException {
		Soak thread1=new Soak();
		Wash thread2=new Wash();
		Dry thread3=new Dry();
		
		thread1.start();
		thread1.join(4000,100);
		thread2.start();
		thread2.join();
		thread3.start();
	}

}
/*
S1
S2
S3
S4  
S5  W1
    w2
    w3
    w4
    w5
          d1*/