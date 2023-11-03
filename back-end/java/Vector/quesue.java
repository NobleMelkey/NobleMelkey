package Vector;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class quesue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<String>();
		
		q.add("noble");
		q.add("nithiya");
		q.add("sam");
		q.add("beula");
		q.add("dhirsha");
		
		System.out.println("elements is queue :"+q);
		System.out.println("removed element:"+q.remove());
		System.out.println("head: "+q.element());
		System.out.println("poll: "+q.poll());
		System.out.println("peek: "+q.peek());
		System.out.println("elements is queue :"+q);
		
		
		
		

	}

}
