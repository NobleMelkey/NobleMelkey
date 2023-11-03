package assement;
import java.util.Scanner;
public class Technum {

	public static void main(String[] args) {
		int num, digit=0,reminder,result=0,temp;
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter the num");
	     num=s.nextInt();
	     temp=num;
	     while(num>0) {
	    	 digit++;
	    	 num=num/10;
	     }
	     num=temp;
	     while(num>0) {
	    	 reminder=num%10;
	    	 result=(int) (result+ Math.pow(reminder, digit));
	    	 num=num/10;
	    	 
	     }
	     if(temp==result) {
	    	 System.out.println("amstrong num");
	     }
	     else {
	    	 System.out.println("not amstrong");

	}

	}
}
