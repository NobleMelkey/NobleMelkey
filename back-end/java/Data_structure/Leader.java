package Data_structure;

import java.util.*;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the element:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the element one by one:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int i;
		for(i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					count++;
					break;
				}
			}
		}
	}
}

	


