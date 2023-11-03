package Sorting;
import java.util.Scanner;
public class selecting_sorting {

	public static void main(String[] args) {
		int i,min_idx,n,step,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the of elements number:");
		n=s.nextInt();

		int a[]=new int [n];
		System.out.println("enter the number one by one:");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("before sorting:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		for( step=0;step<n-1;step++){
			min_idx=step;
			for(i=step+1;i<n;i++) {
				if(a[min_idx]>a[i]) {
					min_idx=i;
				}
			}
			temp=a[step];
			a[step]=a[min_idx];
			a[min_idx]=temp;
			
		}
		System.out.println();
		System.out.println("After sorting:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
		

	}

}
