package org.basics;


 interface InterfaceDemo 
 {
	 void print();
	 
 }
class Test implements InterfaceDemo
  {
	public void print() 
	{
		System.out.println("Abstracction success");
	}
	public static void main(String[] args) 
	{
	Test obj=new Test();
	obj.print();
	}
	
  }