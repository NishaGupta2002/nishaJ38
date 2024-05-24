package com.demostring;

import java.util.StringTokenizer;

public class TestStringBuffered {

	public static void main(String[] args) {
//      StringBuffer sb= new StringBuffer();
//      System.out.println(sb.capacity());
//      
//      StringBuffer sb1= new StringBuffer(5);
//      System.out.println(sb.capacity());
//      
//      StringBuffer  sb2= new StringBuffer("hello world");
//      System.out.println(sb2.capacity());
		
		 StringBuffer sb= new StringBuffer();
	     System.out.println(sb.capacity());
	      
         sb.append("Nisha");
         System.out.println(sb.capacity());
         sb.append("Nisha");
         System.out.println(sb.capacity());
         sb.append("Arpit");
         System.out.println(sb.capacity());
         sb.append("gupta");
         System.out.println(sb);
       //  System.out.println(sb);
         
         sb.insert(10, "-");
         System.out.println(sb);
	     
         StringBuffer sb1=new StringBuffer();
         sb1.append("Arpit");
         System.out.println(sb1);
         
         StringBuffer sb2=new StringBuffer();
         sb2.append("Nisha");
         System.out.println(sb2.reverse());
         StringBuffer sb4=new StringBuffer();
         sb4.append("Arpit");
         System.out.println(sb4.reverse());
         
       
         sb1.delete(1, 4);
         System.out.println(sb1);
         
         sb.compareTo(sb2);
         System.out.println(sb2);
         
         StringBuffer sb3=new StringBuffer();
         sb3.append("Nisha Gupta coder");
         sb3.ensureCapacity(10);
         System.out.println(sb3.capacity());
         
         StringBuilder sd=new StringBuilder();
         sd.append("Nisha");
         System.out.println(sb.capacity());
         
         
         StringTokenizer st=new StringTokenizer("myname is gupta","-");
         while(st.hasMoreTokens()) {
        	 System.out.println(st.nextToken());
        
        }
         
         String s="hello java38 group";
         String r[]= s.split(" ",3);
         for(int i=0; i<r.length;i++)
         {
        	 System.out.println(r[i]+" "+r[i].length());
        	 
         }
         for(String x:r)
        	 System.out.println(x);
         System.out.println(s);
	}

}
