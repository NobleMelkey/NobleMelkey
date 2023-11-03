package Regular_Expresion;
import java.util.*;
public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("steve");
		list.add("carl");
		list.add("raj");
		list.addFirst("negan");
		list.addLast("Rick");
		list.add(2,"Glenn");
		
		Iterator<String> Iterator=list.iterator();
		while(Iterator.hasNext()) {
			
			System.out.println(Iterator.next());
		}
		
		

	}

}
