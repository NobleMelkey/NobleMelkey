package Data_structure;

import java.util.*;

public class Great_elements {
	public static void main(String[] args) {
		int n;
		int flag=0;
		Scanner s= new Scanner(System.in);
	      System.out.println("enter num of element");
	      n=s.nextInt();
	      int arr[]=new int[n];
	      System.out.println("enter element one by one:");
	      for(int i=0;i<n;i++)
	      {
	    	  arr[i]=s.nextInt();
	      }
	      for(int i=0;i<n;i++)
	      {
	    	  if(arr[i]==arr[n-1])
	    	  {
	    		  System.out.println(arr[i]+"->-1");
	    	  }
	    	  for(int j=i+1;j<n;j++)
    		  {
    			  if(arr[i]<arr[j])
    			  
    				  System.out.println(arr[i]+"->"+arr[j]);
    			      break;
    		  }
	    	  if (flag==0)
		    	  System.out.println(arr[i]+"->-1");
		      flag=0;


	      }
	     



		
	}

}
