package Regular_Expresion;
import java.util.*;
public class linked_list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("item1");
		linkedlist.add("item4");
		linkedlist.add("item15");
		linkedlist.add("item3");
		linkedlist.add("item6");
		linkedlist.add(2,"item2");
		
		System.out.println("linked list content: "+linkedlist);
		linkedlist.addFirst("First item");
		linkedlist.addLast("last item");
		System.out.println("linked list after addition: "+linkedlist);
		Object firstvar=linkedlist.get(0);
		System.out.println("first element"+firstvar);
		linkedlist.set(0, "changed first iteam");
		Object firstvar2=linkedlist.get(0);
		System.out.println("first element after updata by set method"+firstvar2);
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("linked list after deletion of the first and last elemant: "+linkedlist);
		linkedlist.add(0,"newly added iteam");
		linkedlist.remove(2);
		Object str=linkedlist.clone();
		System.out.println(str);

	}

}
