package assement3;

import java.util.Scanner;

public class kth_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("enthe no.of element you want in array");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enther all the element one by one:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
		System.out.println("enter the  k th position at which you want to check number:");
		pos=s.nextInt();
		
		System.out.println("Number"+a[pos-1]);

	}

}
