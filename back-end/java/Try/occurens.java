package Try;

import java.util.Scanner;

public class occurens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("enter the occurrens");
        int o =s.nextInt();
        for (int i = 0; i < n; i++) {
            if(0==a[i])
        	count++;
            
        }
        System.out.println(count);
        

	}

}
