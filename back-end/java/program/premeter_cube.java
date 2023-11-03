package program;

import java.util.Scanner;

public class premeter_cube {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the 1st:");
		a=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the 2nd:");
		b=s2.nextInt();
		Scanner s3=new Scanner(System.in);
		System.out.println("enter the 3rd:");
		c=s3.nextInt();
		System.out.println("premeter of cube is :"+(4*(a+b+c)));

	}

}
