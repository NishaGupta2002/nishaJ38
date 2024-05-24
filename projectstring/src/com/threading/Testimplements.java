package com.threading;
//runnable interface is a method with does not call directly
//if we want to extend 1-2 class it is good to use Runnable not Thread
//join ( ) does not allow another () until 1st is completes

//class Mythread4 implements Runnable
//{
//	public void run() {
//		System.out.println("Hello"+Thread.currentThread().getName());
//		
//	}
//}
//public class Testimplements {
//
//	public static void main(String[] args) {
//	            Mythread4 m=new Mythread4();
//	            Thread t= new Thread(m);
//				t.start();
//				
//				
//	}
//}


//sleep and wait() ---:throws interrupted Exception
//class Mythread4 implements Runnable
//{
//	public void run() {
//		
//			for(int i=1;i<=10;i++) {
//				try {
//					Thread.sleep(700);
//					
//				}catch(InterruptedException e)
//			{
//					e.printStackTrace();
//			}
//				System.out.println(i);
//		}
//		
//		
//	}
//}
//public class Testimplements {
//
//	public static void main(String[] args) {
//	            Mythread4 m=new Mythread4();
//	            Thread t= new Thread(m);
//				t.start();
//				
//				
//	}
//}
//
//wap to find perfect number using runnable
//class Mythread4 implements Runnable
//{
//	public void run() {
//		
//		for(int i=1;i<=10;i++) {
//			
//				try {
//					Thread.sleep(700);
//					
//					
//				}catch(InterruptedException e)
//			{
//					e.printStackTrace();
//			}
//				System.out.println(i);
//		}
//		
//		
//	}
//}
//
//public class Testimplements {
//
//	public static void main(String[] args) {
//	            Mythread4 m=new Mythread4();
//	            Thread t= new Thread(m);
//				
//				t.setDaemon(true);
//				t.start();
//				
//				
//				
//	}
//}
//


class Mythread4 implements Runnable
{
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			f();
		}
		
	
	
	else {
		u();
	}
	}
	void f() {
		System.out.println("daemon thread is working");
	}
	void u() {
		System.out.println("user thread is working");
	}
	
}

public class Testimplements {

	public static void main(String[] args) {
	            Mythread4 m=new Mythread4();
	            Thread t= new Thread(m);
				
				t.setDaemon(true);//daemon is a background support method
				t.start();
				
				 Thread t2= new Thread(m);
				t2.start();
				
				
	}
}

