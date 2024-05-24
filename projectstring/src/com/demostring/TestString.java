//string is a collection of character.it is a internally defined class.
package com.demostring;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
//		String s="hello";//string literal
//		s=s.concat("world");
//		String s1=s.concat("world");
//		
//		System.out.println(s);
//		System.out.println(s1);
		
		
//		System.out.println(s);
//		char ch[]= {'h','e','l','l','o'};
//		String s1 = new String(ch);//string using new keyword
//		System.out.println(s1);
//		
//		String s2 = new String("hello");
//		System.out.println(s2);
//		
//		Scanner sc=new Scanner(System.in);
//		String s3=sc.next();
		
		
// third
		
//		String s="hello";
//		String s2=new String("hello");
//		String s3="hello";
//		
//		System.out.println(s==s3);
//		System.out.println(s==s2); //== to check the address (s-scp, s2-heap)
//		System.out.println(s.equals(s2));
//		
//		System.out.println(s.hashCode());
//		System.out.println(s2.hashCode());
//		
//		//s.concat("world");
//		//strings are immutable
//		s=s.concat("world");
//		String s1=s.concat("world");
//		
//		
//		System.out.println(s);
//		System.out.println(s1);
		
		String s="Sachin";
		String s2=new String("Sachin");
		String s3="hello";
		String s6="Hello";
		String str="java";
		String str2="Java";
		
		System.out.println(s==s3);
		System.out.println(s==s2); //== to check the address (s-scp, s2-heap)
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s6));
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		//s.concat("world");
		//strings are immutable
		s=s.concat("Tendulkar");
		String s1=s.concat("world");
		
		
		System.out.println(s);
		System.out.println(s1);
		
		String s4="aood";
		String s5="good";
		
		System.out.println(s4.compareTo(s6));
		
		String s7=50+30+"sachin"+40+40; //after string every thing become string
		String s8=50+30+"sachin"+(40+40);
		System.out.println(s7);
		System.out.println(s8);

		System.out.println(s7.substring(2)); // use of substring
		System.out.println(s7.substring(2,9));
		System.out.println(s7.subSequence(2, 8));
		System.out.println(str.toUpperCase());//uppercase
		System.out.println(str2.toLowerCase());//lowercase
		System.out.println(s.startsWith("Sac"));
		System.out.println(s.endsWith("n"));
		System.out.println("hello".charAt(2));
		
    }

}
