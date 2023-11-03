package assement3;

import java.util.Scanner;

public class Array_is_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=0;//n=size
		Scanner s=new Scanner(System.in);
		System.out.println("enthe no.of element you want in array");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enther all the element one by one:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
	
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j+1])
				{
					temp=1;
				}
				
			}
			for (int i1=0;i1<n;i1++) {
				for(int j=i1+1;j<n;j++) {
					if(a[i1]>a[j+1])
					{
						temp=1;
					}
					
				}
		}
		
		System.out.println("Array is strictly increasing");
		
		System.out.println("Array is not strictly increasing");

	}

	}}
