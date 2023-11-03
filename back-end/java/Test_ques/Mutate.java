package Test_ques;

import java.util.Scanner;

public class Mutate {

	public static void main(String[] args) {
		int n , b;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the elements :");
		n=s.nextInt();
		int a[]= new int[n+1];
	    System.out.print("enter the intput numbers:");
	    
	    for(int i=0; i<n; i++){
	    	a[i]=s.nextInt();
	    	
	    }
	    for(int i=0; i<n; i++)
	    {
	    	if(i==0 && a[0]==0)
	    		a[0]=a[1];
	    	else if(i==n-1 && a[n-1]==0)
	    		a[n-1]=a[n-2];
	    	else if (a[i]==0)
	    		a[i]=a[i-1]+a[i+1];
	    	
	    	
	    }
	    for(int arr:a) {
	    	 System.out.print(arr);
	    }
	    s.close();
	    

	}

}
