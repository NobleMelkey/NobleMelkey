package Array;
import java.util.Scanner;
public class inset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p,e;
		//p=posction,n=number,e=elements
		Scanner s= new Scanner(System.in);
	    System.out.print("enter the element numbers:");
	    n=s.nextInt();
	    int arr[]= new int[n+1];
	    System.out.print("enter the numbers:");
	    for(int i=0; i<n; i++){
	    	arr[i]=s.nextInt();
	    	
	    }
	    System.out.println("enter the position:");
	    p=s.nextInt();
	    System.out.println("enter the elemnts:");
	    e=s.nextInt();
	    int j=n;
	    while(j>=p-1) {
	    	arr[j]=arr[j-1];
	    	j--;
	    }
	    arr[p-1]=e;
	    System.out.println("after inset "+" ");
	    for(int i=0;i<(n+1);i++) {
	    System.out.println(arr[i]+" ");
	    }
	    
	    
	    
	   
	}

}
