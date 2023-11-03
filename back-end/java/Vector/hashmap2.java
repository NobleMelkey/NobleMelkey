package Vector;
import java.util.*;
public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< Integer ,String> hmap=new HashMap< Integer, String>();
		
		hmap.put(12, "noble");
		hmap.put(2, "nithiy");
		hmap.put(3, "sam");
		hmap.put(6, "beula");
		hmap.put(3, "dhirsha");
		
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.println("key is :"+mentry.getKey()+"& value is:");
			System.out.println(mentry.getValue());
		}
		String var=hmap.get(2);
		System.out.println("value at index 2 is:"+var);
		
		hmap.remove(3);
		System.out.println("map key and values after removal:");
		Set set2=hmap.entrySet();
		Iterator iterator2=set.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry mentry2=(Map.Entry)iterator2.next();
			System.out.println("key is :"+mentry2.getKey()+"& value is:");
			System.out.println(mentry2.getValue());
		}

	}

}
