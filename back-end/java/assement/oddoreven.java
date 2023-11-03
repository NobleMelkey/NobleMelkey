package assement;
import java.util.Scanner;
public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enther the number:");
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("it is an even number");
			
		}
		else {
			System.out.println("it is an odd number");
		}
			

	}

}
