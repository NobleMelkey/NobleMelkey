package Regular_Expresion;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("C");
		a.add("A");
		a.add("E");
		a.add("B");
		a.add("D");
		a.add("F");
		System.out.println("Original contents of a: ");
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.println(element+" ");
		
			
		}
		System.out.println();
		ListIterator litr = a.listIterator();
		while(litr.hasNext()) {
			Object element=litr.next();
			litr.set(element+ "+");
			
		}
		System.out.println("modified contents of a1: ");
		itr =a.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.println(element+" ");
		}
		System.out.println();
		
		System.out.println("modified list backwords: ");
		while(litr.hasPrevious()) {
			Object element=litr.previous();
			System.out.println(element+" ");
		}
		
		System.out.println();

	}

}
