package assement;
import java.util.Scanner;
public class single_digite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a,sum=0;
		a=s.nextInt();
		while(a>0) {
			int ls=a%10;
			sum=ls+sum;
			a=a/10;
			
			
		}
		System.out.println(sum);

	}

}
