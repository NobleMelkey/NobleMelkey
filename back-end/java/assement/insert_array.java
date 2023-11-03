package assement;
import java.util.Scanner;
public class insert_array {

	public static void main(String[] args) {
		int n,pos,w;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first elament:");
		n=s. nextInt();
		int a[]=new int[n+1];
		System.out.println("enter the all element one by one :");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("enter the position where the element to place it :");
		pos=s.nextInt();
		System.out.println("enter the element to replace it :");
		w=s.nextInt();
		int i=5;
		while (i>(pos-1))
		{
			if(a[])
			a[i]=a[i-1];
			i--;
			
		}
		for(int j=0;j<n+1;j++)
		{
			System.out.print(a[j]);
			
		}
		
		
		
		

	}

}
