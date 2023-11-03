package assement3;

import java.util.Scanner;

public class Search_key {

	public static void main(String[] args) {
		int n,x,temp=0;//x is the search
		Scanner s=new Scanner(System.in);
		System.out.println("enthe the number");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enther the number one by one:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
		System.out.println("enter the number to be search:");
		x=s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
			System.out.println("the Element found at position:"+(i+1));
			}
			else {
				temp=1;
			}
			
			
		}
			if(temp==1) {
			System.out.println("the element is not found");
			
			
		
		
		}
	}

}
