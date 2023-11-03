package Regular_Expresion;

import java.util.ArrayList;

public class exaample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Comparable> alist=new ArrayList<Comparable>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		alist.add("12.0");
		alist.add("3");
		
		//displaying the elements
		System.out.print(alist);
		//adding the "steve": the the fourth position 
		alist.remove("steve");
		alist.remove("Angela");
		//displaying the elements
		System.out.print(alist);
		
		alist.remove("2");
		
		System.out.print(alist);
		
		
		
		

	}

}
