package assement;
import java.util.Scanner;
public class sherlock_apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of apples:");
		int n,m;
		n=s.nextInt();
		System.out.println("enter the no.of peoples:");
		m=s.nextInt();
		if(n%m==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		

	}

}
