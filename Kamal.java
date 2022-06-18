package org.basics;

interface Kamal 
{
   public void run();
}
class Selva implements Kamal
{
	public void run()
	{
		System.out.println("Success");
	}
	public static void main(String arg[]) 
	{
		Selva obj=new Selva();
		obj.run();
	}
}
