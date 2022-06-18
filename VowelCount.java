package org.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelCount 
{
	public static void main(String args[])
	{
	 String s="my name is kaomaleeeeuesh";
	 char[] ch=s.toCharArray();
	 Map<Character,Integer> mp=new HashMap<Character,Integer>();
	for(int i=0;i<ch.length;i++)
	{
	   char c=ch[i];
	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
	    if(mp.containsKey(c))
	    {
		Integer in=mp.get(ch[i]);
	        mp.put(c,in+1);
	    }
	   else
	    {
	     mp.put(c,1);
	    }

	}
	}
	   Set<Entry<Character,Integer>> Entry=mp.entrySet();
	   for(Entry<Character,Integer> entry : Entry)
	{
	  System.out.println(entry);
	}
	
	}
	}

