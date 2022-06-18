package org.basics;

class Override
{
  void listion()
  {
  System.out.println("parents are listening");
  }
}
class MethedOverriding extends Override
{
 void listion() 
 {
  System.out.println("childrens are listenig");
 }
 
 public static void main(String args[]) 
 {
	 MethedOverriding obj=new MethedOverriding();
	 obj.listion();
	 Override obj1=new Override();
	 obj1.listion();
 }
}
