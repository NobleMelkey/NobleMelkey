package assement;

import java.util.Scanner;

public class pocirle {

	public static void main(String[] args) {
		int r ;
		double p=3.142 , a;
		Scanner s=new Scanner (System.in);
		System.out.print("Radius= ");
		r=s.nextInt();
		a=2*p*r;
		System.out.println("Perimeter="+a);
		

	}

}
