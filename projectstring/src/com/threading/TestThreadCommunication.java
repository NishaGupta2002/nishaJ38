package com.threading;

class Customer{


		int amount=10000;
	
synchronized public void withdraw(int amount) {
	System.out.println("going to withdraw money");
	if(this.amount<amount) {
		System.out.println("less amount waiting for deposit");
		try {
			wait();
		}catch(InterruptedException e) {
		e.printStackTrace();
		}
	}
	
	this.amount-=amount;
	System.out.println("remaining amount"+this.amount);
}
 synchronized public void deposit(int amount) {
	 System.out.println("going to deposit");
	this.amount+=amount;
	System.out.println("deposit successful!");
	notify();
}
}


public class TestThreadCommunication {

	public static void main(String[] args) {
      Customer c= new Customer();
      
      Thread t1=new Thread() {
    	  public void run() {
    		  c.withdraw(15000);
    		
    	  }
      };
      t1.start();
      
      Thread t2=new Thread() {
    	  public void run() {
    		  c.deposit(15000);
    	  }
      };
      
		t2.start();
	}

}
