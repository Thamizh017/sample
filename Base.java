package org.basics;

public class Base 
{
  int a=10,b=30,c=40,d,f,g;
	 public	void add()
		{
		  d=a+b;
		  System.out.println("the addition value of d: "+d);
		}
		void substraction()
		{
		  f=a-b; 
		  System.out.println("the substraction value of f : " + f);
		}
}
	 class Sub extends Base
	{
		void addition()
		{
			g=b+c;
			System.out.println("the add value of g :" +g);
		}
	public static void main(String args[]) 
	{
		  Sub obj1=new Sub();
		  obj1.add();
		  obj1.substraction();
		  obj1.addition();
	}
	}

