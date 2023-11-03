package Try;

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		int ct;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int out = 0; out < n; out++) {
            a[out] = scanner.nextInt();
        }
        System.out.println("after removing the duplicate");
        
        for (int out = 0; out < n; ++out) {
            ct=0;
            for(int in=out+1;in<n;++in) {
            	if(a[out]==a[in]) 
            		ct++;
            		
            	
            }
            
            if(ct==0) 
            	
            	System.out.println(a[out]);
            
            
            	
        }
        
        
        

        
    }
}
