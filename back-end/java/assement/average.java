package assement;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		if (average>90) {
			
			System.out.println("Exellent");
		}
		else if (average>50&&average<60) {
			
			System.out.println("poor");
		}
else if (average>60&&average<70) {
	
	System.out.println("work hard");
}
else if (average>70&&average<80) {
	
	System.out.println("good");
}
else if (average>80&&average<90) {
	
	System.out.println("very good");
}

else  {
	
	System.out.println("fail");
}
	}

}
