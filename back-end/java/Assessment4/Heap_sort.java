package Assessment4;

import java.util.Scanner;

public class Heap_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max_id,n,step,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the of elements number:");
		n=s.nextInt();

		int a[]=new int [n];
		System.out.println("enter the number one by one:");
		for(i=0;i<n;i++) 
		{
			a[i]=s.nextInt();
		}
		System.out.println("before sorting:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		for( step=n-1;step<0;step--)
		{
			max_id=i;
			for(i=step-1;i<0;i--)
			{
				if(a[i]<a[max_id])
				{
					max_id=i;
				}
			}
			temp=a[step];
			a[step]=a[max_id];
			a[max_id]=temp;
			
		}
		System.out.println();
		System.out.println("After sorting:");
		for(i=0;i<n;i++) 
		{
			System.out.println(a[i]);
		}

	}

	}


