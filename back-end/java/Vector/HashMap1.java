package Vector;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1=new HashMap<String, Integer>();
		m1.put("zara", 8);
		m1.put("mahnaz", 31);
		m1.put("ayan", 12);
		m1.put("daisy", 14);
		
		System.out.println();
		System.out.println("map Elements");
		System.out.println("\t"+m1);
		System.out.println(m1.get("ayan"));

	}

}
