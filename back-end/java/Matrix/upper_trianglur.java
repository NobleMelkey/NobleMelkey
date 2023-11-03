package Matrix;
import java.util.Scanner;
public class upper_trianglur {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r,c,flag=0 ;
		System.out.println("row");
		r=s.nextInt();
		System.out.println("colum");
		c=s.nextInt();
		if(r==c) {
			int a[][]=new int[r][c];
			System.out.println("enter the matrix :"+"");
			for (int i=0;i<r;i++){
				for(int j=0;j<c;j++) {
					a[i][j]=s.nextInt();
					
				}
			}
			for(int i=1;i<r;i++)
			{
				for(int j=1;j<r;j++)
				{
					if(a[i][j]!=0) {
						flag=1;
					}
				}
			}
			if(flag==0) 
				System.out.println("yes");
			else
				System.out.println("no");
			
			
		}
		else
			
		{
			System.out.println("row and coloum is miss match");
		}

	}

}
