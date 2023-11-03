package program;

import java.util.Scanner;

public class Nobita {
	
	public static void main(String[] args) {
		int c,s;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the purchase amt:");
		c=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the purchase amt:");
		s=s2.nextInt();
		System.out.println("profit:"+Math.abs(c-s));
		
	}

}
