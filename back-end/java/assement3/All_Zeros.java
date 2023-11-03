package assement3;

import java.util.Scanner;

public class All_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,c=0;//n=size
		Scanner s=new Scanner(System.in);
		System.out.println("enthe no.of element you want in array");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("enther all the element one by one:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter the which you want to count number of occurrences:");
		x=s.nextInt();
        for (int i = 0; i < n; i++) {
           if(x==a[i]) {
        	   c++;
           }
            
        }
        System.out.println("Number of Occurrence of the Element:"+c);

	}

}
