package org.basics;

abstract class Abstraction 
{
	abstract void success();
}
class B extends Abstraction
{
	void success() 
	{
		System.out.println("Complited");
	}
	public static void main(String args[]) 
	{
		B obj=new B();
		obj.success();
	}
}