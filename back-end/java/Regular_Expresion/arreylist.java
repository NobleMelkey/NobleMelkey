package Regular_Expresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arreylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		Scanner s= new Scanner(System.in);
	    System.out.print("enter the num of elements:");
	    int n=s.nextInt();
	    
		a.add("Steve");
		a.add("Tim");
		a.add("Lucy");
		a.add("Pat");
		a.add("Angela");
		a.add("Tom");
		a.set(2, "Malathy");
	   /* System.out.println("enter the num 1 by 1:");
	    for(int i=0;i<n;i++)
	    {
	    	a.add(s.next());
	    }*/
	    
		System.out.println("arreylist: ");
		System.out.println(a);
		Collections.sort(a);
		System.out.println("arreylist using for each: ");
		for(String str1:a)
		{
			System.out.println(str1);
		}
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Pat"));
		System.out.println(a.contains("Malathy"));
	}

}
