package Sorting;
import java.util.Scanner;
public class insertion {
	static void InsertionSort (int a[],int n) {
		for(int step=0;step<n-1;step++) {
			int key=step;
			for(int j=step-1;j>=0;j--) {
				if(a[j]>a[key]) {
					int temp=a[j];
					a[j]=a[key];
					a[key]=temp;
					key--;
							
				}
			}
		}
	}
	static void print(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}



	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("eneter the nums");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		InsertionSort(a,n);
        System.out.println("after sorting:");
        print(a,n);

		

	}

}
