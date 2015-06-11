package com.qvc.it.china;

import java.util.HashMap;

public class HelloWorld {
	
	 final String name = "Joe";
	 
	 public String getName(){
//		 this.name = "Tim";
		 return name;
	 }
	 
	 public static Integer getAge(){
		 
		 return 18;
	 }
	 

	public static void main(String args[]){
		System.out.println("Hello, Wrold!");
		
		HashMap<Integer, String> map = new HashMap();
		
		System.out.println(HelloWorld.getAge());
		
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.getName());
		
	}
}
