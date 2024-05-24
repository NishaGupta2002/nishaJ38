package com.threading;

import java.util.Scanner;

//threads can be created two ways:1)by extending thread class , 2) by implementing runnable interface
//thread work independently 
//class MyThread extends Thread
//{
//	public void run() {
//		
//		System.out.println("Hello"+currentThread().getName());
//		
//	}
//}
//
//public class TestThreading {
//
//	public static void main(String[] args) {
//		MyThread m=new MyThread();
//		m.run();
//		
//		
//		MyThread mt=new MyThread();
//		mt.setName("working thread1");
//		mt.start();
//		
//		mt.getPriority();
//		
//		MyThread mt1=new MyThread();
//		mt1.setName("working thread2");
//		mt1.start();
//     
//		MyThread mt2=new MyThread();
//		mt2.setName("working thread3");
//		mt2.setPriority(8);
//		mt2.start();
//     
//		MyThread mt3=new MyThread();
//		mt3.start();
//	}
//}
		//wap to create two thread class of print 1-50 and two print 50-100
//		class Mythread extends Thread
//		 {
//			public void run() {
//		     System.out.println("Pint numbers 1-50");
//		     for(int i=1; i<=50; i++)
//		      System.out.println(i);
//			}
//			void show() {
//				System.out.println("print number 50-100");
//				for(int j=50; j<=100;j++)
//					System.out.println(j);
//			}
//			 
//		 }
//		 
//		public class TestThreading {
//
//			public static void main(String[] args) {
//				Mythread m=new Mythread();
//				m.run();
//				m.show();
//     }
//     }
//q2 wap to create two thread 1 is print 1-50 2nd will print  50-1

//   class Mythread extends Thread
//   {
//	   public void run() {
//		   System.out.println("print 1-50");
//		   for(int i=1; i<=50; i++)
//			   System.out.println(i);
//	}
//   }
//   
//   class Mythread2 extends Thread{
//	   public void show() {
//		   System.out.println("print 50-1");
//		   for(int j=50; j>=1; j--)
//			   System.out.println(" "+j);
//	   }
//	   
//   }
//	   
//
//
//	public class TestThreading {
//
//			public static void main(String[] args) {
//				Mythread m=new Mythread();
//				m.run();
//				Mythread2 m1=new Mythread2();
//				m1.show();
//				
//				
//			}
//	}

class Mythread extends Thread
{
	public void run() {
	
    System.out.println("Enter a number");
    long n, sum=0;//6
    int i=1;
    Scanner sc = new Scanner(System.in);
    n=sc.nextLong();
    while(i<=n/2) {//1<=6/2 > 3   2<=
    	if(n%i==0) {//3%1==0 > 3
    		sum+=i;//0+3=3
    		i++;//2
    	}
    	if(sum==n)
    	{
    		System.out.println("perfect number"+sum);
    	}
    	else {
    		System.out.println("not perfect");
    	}
    }
	}
	 
}

public class TestThreading {

	public static void main(String[] args) {
		Mythread m=new Mythread();
		m.run();
		
}
}