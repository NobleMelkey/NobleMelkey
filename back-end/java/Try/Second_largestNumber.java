package Try;

import java.util.Scanner;

public class Second_largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i=0; i<n;i++ ) {
        	for (int j=1+1;j<n;j++) {
        		if(a[i]>a[j]) {
        			int temp;
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        }
        System.out.println("after sorting");
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]+" ");
        	
        }
        System.out.println("smallest number in a array"+ a[0]);
        System.out.println("lagerst number in a array "+ a[n-2]);
		
        
	}

}
