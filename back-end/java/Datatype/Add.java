package Datatype;

import java.util.Scanner;
//this is dynamic program exmple
public class Add {

	public static void main(String[] args) {
		//this is the program to adding the two number 
		//by using a + b 
		int a,b,result;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a=s.nextInt();
		System.out.print("enter the second number ");
		b=s.nextInt();
		result=a+b;
				System.out.println("adding two numbers:"+result);
	}
	
	

}
