/*deadlock is a type of thread. dead lock occur in situation when one thread is waiting for other threads  object
 * wait() and hold(),notifyAll(),notify():is used to avoid deadlock
 *  the process of performing task sequensially is call synchronization* */

package com.threading;
//critical section : lock is created
//wait() & notify,notifyAll()() is of which class:object class
//
public class TestDeadlock {
	String str1="java";
	String str2="program";

	
	Thread trd1=new Thread("My thread2") 
	{
		public void run()
		{
			while(true) 
			{
				
				synchronized(str2)
				{
				synchronized(str1)
				{
					
				
				System.out.println(str2+str1);
				}
				}
			}
		
		}
//	   
//		
//	 
	};
	Thread trd2=new Thread("My thread2") 
	{
		public void run()
		{
			while(true) 
			{
				
				synchronized(str1)
				{
				synchronized(str2)
				{
					
				
				System.out.println(str1+str2);
				}
				}
			}
		
		}
	   
		
	 
	};
	public static void main(String[] args) {
		TestDeadlock td=new TestDeadlock();
	     td.trd1.start();
	    td.trd2.start();
	    
	}

}

