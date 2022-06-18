package org.basics;

public class Checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="im kamalesh from ramanadhsapuram",s2="";
  String[] s3=s1.split(" ");
  for(String s4:s3)
  {
	  String s5=" ";
	  for(int i=s4.length()-1;i>=0;i--)
	  {
		  char c=s4.charAt(i);
		  s5=s5+c;
	  }
	  s2=s2+s5+" ";
  }
  System.out.println(s2);
 
	}

}
