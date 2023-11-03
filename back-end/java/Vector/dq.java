package Vector;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class dq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("noble");
		dq.add("nithiya");
		dq.addLast("sam");
		dq.addFirst("beula");
		dq.add("dhirsha");
		
		System.out.println("elements is Deque :"+dq);
		System.out.println("removed element:"+dq.removeLast());
		System.out.println("elements is Deque: "+dq);
		System.out.println("removed element: "+dq.removeFirst());
		System.out.println("elements is Deque: "+dq);
		dq.addFirst("nothi");
		System.out.println("elements is Deque :"+dq);
		System.out.println("head: "+dq.element());
		System.out.println("poll: "+dq.pollLast());
		System.out.println("peek: "+dq.peek());
		System.out.println("elements is Deque :"+dq);
		System.out.println("elements is Deque :"+dq.isEmpty());
		



	}

}
