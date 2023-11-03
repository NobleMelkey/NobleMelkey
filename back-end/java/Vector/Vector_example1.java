package Vector;
import java.util.*;
public class Vector_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(5);
		vec.addElement("apple");
		vec.addElement("orenge");
		vec.addElement("manogo");
		vec.addElement("fig");
		vec.addElement("food");
		
		System.out.println("Size is:"+vec.size());
		System.out.println("default capacity increment is :"+vec.capacity());
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		
		System.out.println("Size after addition:"+vec.size());
		System.out.println("capacity after increment is :"+vec.capacity());
		
		Enumeration en=vec.elements();
		System.out.println("\nElements are:");
		
		while(en.hasMoreElements()) {
		System.out.println(en.nextElement()+" ");
		}
	}

}
