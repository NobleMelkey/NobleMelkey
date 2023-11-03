package Control_flow;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		int a;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the number:");
		a=s1.nextInt();
		if(a%2==0) {
			System.out.println("even number :"+a);
		}
		else{
			System.out.println("odd numder:"+a);
			
		}
		

	}

}
