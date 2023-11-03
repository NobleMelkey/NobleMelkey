package Sorting;
import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,step,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		
		
		int a[]=new int [n];
		System.out.println("enter the number one by one:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for( step=0;step<n-1;step++);
		{
			for( i=0;i<n-step-1;i++);
		
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				
			}
			
		}
		
		
		

	}
	

}

