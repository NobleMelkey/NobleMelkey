package arimatics;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner s=new Scanner (System.in);
		System.out.print("enter the number:");
		num=s.nextInt();
		result=(num%2==0)? "even num":"odd num";
		System.out.println(result);
		s.close();

	}

}
