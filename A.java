package sample;

public class A 
{
	A()
	{
		System.out.println("parent class");
	}
}
 class Base extends A
{
	Base()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) 
	{
		Base obj=new Base();
	}
}