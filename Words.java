package sample;

public class Words {

	public static void main(String[] args)
	{
   String s="my name is kamal my friend name is bala";
   int my=0,name=0;
   String[] k=s.split(" ");
   for(String k3:k)
   {
	   System.out.println(k3);
	   if(k3=="my")
	   {
	    my++;
	    System.out.println(my);
	   }
	   if(k3=="name")
	   {
		   name++;
		    System.out.println(name);

	   }
	 
   }
  
	}

}
