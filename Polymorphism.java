package org.basics;

public class Polymorphism 
{
	int d;
  void addition(int a,int b)
  {
	  d=a+b;
	  System.out.println("the addition value d :"+d);
	 
  }
  void addition(int a,int b,int c)
  {
	  d=a+b+c;
	  System.out.println("the addition value d :"+d);
  }
  double addition(int a,int b,double c)
  {
	  double d;
	  d=a+b+c;
	  System.out.println("the addition value d :"+d);
	  return d;
  }
  public static void main(String args[])
  {
	  Polymorphism obj=new Polymorphism();
	  obj.addition(4,5);
	  obj.addition(5,5,8);
	  obj.addition(10,20,22.3);
  }
}

