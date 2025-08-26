package day6;

public class Father extends Thread{
	
	Bank bank;
	
	public Father(Bank bank)
	{
		this.bank=bank;
	}

	@Override
	public void run() {
		this.bank.deposit(15000);
	}
}
