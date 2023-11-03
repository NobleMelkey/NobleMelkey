package Data_structure;

import java.util.*;

public class DecimalToBinary {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n , rem ,count=0;
        n = s.nextInt();
        
        while(n!=0)
        {
        	rem=n%2;
        	n=n/2;
        	System.out.println(rem);
        	if(rem==1)
        	{
        		count++;
        	}
        }
        
        

        System.out.println(count);
    }
	
}
