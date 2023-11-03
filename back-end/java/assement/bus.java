package assement;
import java.util.Scanner;
public class bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n1,temp=0,res=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num");
        a=s.nextInt();
        //temp=a;
        String str=Integer.toString(a);
        int len=str.length();
        for(int i=1;i<=len;i++) {
        	n1=a%10;
        	a=a/10;
        	
        	if(a%7==0&n1==7) 
        	{
        		temp=2+temp;
        		res=temp;
        	
            	//System.out.println("BUZZ");
            }
           
        	
        }
        if(res==2) {
        	System.out.println("BUZZ");
        }
        else
        {
        	System.out.println("not BUZZ");
        }
        
        //a=temp;
        
	}
	}


