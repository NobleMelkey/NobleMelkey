package Try;

import java.util.Scanner;

public class largestnumber {
	public static void main(String[] args) {
		int n,count=0;
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
        	System.out.println(a[0]);
        }
	}

}
