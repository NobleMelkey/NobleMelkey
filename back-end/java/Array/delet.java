package Array;
import java.util.Scanner;
public class delet {
	public static void main(String[] args) {
		int n,p;
		Scanner s= new Scanner(System.in);
	    System.out.println("enter the element numbers:");
	    n=s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("enter the one by one:");
	    for(int i=0;i<n;i++) {
	    	arr[i]=s.nextInt();
	    	
	    }
	    System.out.println("enter the delet position:");
	    	p=s.nextInt();
	    	j=p;
	    	while (j<n) {
	    		arr[j-1]=arr[j];
	    		j++;
	    	}
	    	n=n-1;
	    	for(i=0;i<n;i++) {
	    		
	    	}
	    
		
	}

}
