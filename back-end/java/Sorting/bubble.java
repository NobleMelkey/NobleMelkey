package Sorting;

import java.util.Scanner;

public class bubble {
    static void bubbleSort (int a[],int n) {
    	for(int step=0;step<n-1;step++) {
    		for(int i=0;i<n-step-1;i++) {
    			if(a[i]>a[i+1]) {
    				int temp=a[i];
    				a[i]=a[i+1];
    				a[i+1]=temp;
    				
    			}
    		}
    		
    	}
    }
    static void print_array (int a[], int n) {
    	for(int i=0;i<n;i++) {
    		System.out.println(a[i]);
    		
    	}
    }
    public static void main(String[] args) {
    	int n,i;
    	Scanner s=new Scanner(System.in);
		System.out.println("enter the number of element:");
		n=s.nextInt();
		int a[]=new int [n];
		System.out.println("enter the number one by one:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		bubbleSort(a,n);
		System.out.println("Element after the bullesort:");
		print_array(a,n);
		s.close();
		
    }
}
