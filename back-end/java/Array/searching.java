package Array;
import java.util.Scanner;
public class searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,search;
		Scanner s= new Scanner(System.in);
	    System.out.println("enter the element numbers:");
	    n=s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("enter the one by one:");
	    for(int i=0;i<n;i++) {
	    	arr[i]=s.nextInt();
	    	
	    }
	    System.out.println("enter the search element:");
	    search=s.nextInt();
	    for(int i=0; i<n; i++) {
	    	if(arr[i]==search) {
	    		System.out.println("seatch element:"+search+"at position"+(i+1));
	    	}
	    }
	    
	    

	}

}
