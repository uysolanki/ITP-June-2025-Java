package day6;

public class Bank {

	private double balance;
	
	public Bank() {}
	public Bank(double balance)
	{
		this.balance=balance;
	}
	
	public synchronized void deposit(double dAmt) 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance+=dAmt;
		notify();
	}
	
	public synchronized void withdraw(double wAmt)
	{
		if(wAmt>this.balance)
		{
			try {
				System.out.println("Insuficient Funds, not able to withdraw " + wAmt+ " bcoz current balance is "+this.balance);
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.balance-=wAmt;
		System.out.println("withdrwal successful, Updated Balace "+this.balance);
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	
}
