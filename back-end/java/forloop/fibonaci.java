package forloop;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		int num,f1=0,f2=1,f3;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the total number:");
		num=s.nextInt();
		System.out.print("Fibonacci series");
		System.out.print(f1+" "+f2+" ");
		for(int i=2; i<=num;i++) {
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f3+ " ");
		}
		

	}

}
