package Assessment4;

import java.util.Scanner;

public class Insertion_sort {
	static void Insertionsort (int a[], int n)
	{
		for (int step=0;step<n-1;step++)
		{
			int key=step;
			for(int j=step-1;j>=0;j--) 
			{
				if(a[j]>a[key]) 
				{
					int temp=a[j];
					a[j]=a[key];
					a[key]=temp;
					key--;
							
				}
			}
		}
		
	}
	static void print (int a[], int n) 
	{
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number of elements u need :");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.print("eneter the number to sort:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Insertionsort(a,n);
        System.out.print("after sorting:");
        print(a,n);
		
			
		

	}

}
