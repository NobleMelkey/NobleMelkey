package Datatype;

import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		int studantID,Mark1,Mark2,Mark3;
	    String name;
	    float total,average;
	    
	    
	    Scanner s= new Scanner(System.in);
	    System.out.print("enter the rollno:");
	    studantID =s.nextInt();
	    System.out.print("Enter the name :");
	    name=s.next();
	    System.out.print("enter the 1st mark:");
	    Mark1 =s.nextInt();
	    System.out.print("enter the 2nd mark:");
	    Mark2 =s.nextInt();
	    System.out.print("enter the 3rd mark:");
	    Mark3 =s.nextInt();
	  
	
		total=Mark1+Mark2+Mark3;
				System.out.println("total marks:"+total);
		average=total/3;
		System.out.println("total average:"+average);
	    
	    
	    
	    
	    	
	 
	    

	}

}
