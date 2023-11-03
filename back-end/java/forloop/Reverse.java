package forloop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	   int a ,reminder, result=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		a=s.nextInt();
		while (a>0) {
			reminder=a%10;
			result=result*10+reminder;
			a=a/10;
			
			
		}
		
		System.out.print(result);
		

	}

}
