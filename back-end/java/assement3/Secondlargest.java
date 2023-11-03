package assement3;

import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enthe no.of element you want in array");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enther all the element one by one:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println("second largest number:"+a[n-2]);
		System.out.println("smallest number:"+a[0]);


	}

}
