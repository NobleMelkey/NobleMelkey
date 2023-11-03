package Vector;
import java.util.*;
public class Hashmaplooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap< Integer ,String> hmap=new HashMap< Integer, String>();
		
		hmap.put(12, "noble");
		hmap.put(2, "nithiy");
		hmap.put(3, "sam");
		hmap.put(6, "beula");
		hmap.put(3, "dhirsha");
		
		System.out.println("for loop:");
		for(Map.Entry me :hmap.entrySet())
		{
		System.out.println("key:"+me.getKey()+"&value"+me.getValue());
		}
		System.out.println("While loop:");
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me2=(Map.Entry) iterator.next();
			System.out.println("key:"+me2.getKey()+"&value:"+me2.getValue());
		}
	}

}
