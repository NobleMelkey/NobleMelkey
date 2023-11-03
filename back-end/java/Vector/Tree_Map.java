package Vector;

import java.util.*;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap< Integer ,String> hmap=new TreeMap< Integer, String>();
		hmap.put(11, "noble"); 
		  hmap.put(2, "nithiya"); 
		  hmap.put(33, "sam"); 
		  hmap.put(9, "beula"); 
		  hmap.put(3, "dhirsha"); 
		  hmap.put(4, "ganasan");
		  hmap.put(8, "mariy");
		  hmap.put(89, "dhirshni");
		  hmap.put(34, "ashcwin");
		 
		   Set set=hmap.entrySet(); 
		   Iterator i=set.iterator(); 
		   while(i.hasNext()) 
		   { 
		    Map.Entry m=(Map.Entry)i.next(); 
		    System.out.println("key is:"+m.getKey()+"val is:"+" "+m.getValue()); 
		   }

	}

}
