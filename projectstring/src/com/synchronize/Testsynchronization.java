package com.synchronize;
//Synchronization in Java is the capability to control the access of multiple threads to any shared resource


class Table{
//	synchronized public void find(int n) {
//		for(int i=1; i<5; i++) {
//			System.out.println(n*i);
	public void find(int n) {
		synchronized(this){
			for(int i=1; i<=5; i++) 
        		System.out.println(n*i);
		}
		System.out.println();
	}
}

	class MyThread1 extends Thread{
		Table t;
		MyThread1(Table t){
			this.t=t;
		}
	
	
	public void run() {
		t.find(5);
	}
}
	
	class Thread2 extends Thread{
		Table t;
	Thread2(Table t){
			this.t=t;
		}
	
	public void run() {
		t.find(10);
	}
	
}
public class Testsynchronization {

	public static void main(String[] args) {
		Table ob= new Table();	
	    MyThread1 t1=new MyThread1(ob);
	    t1.start();
	    Thread2 t2 = new Thread2(ob);
	    t2.start();

	}

}
