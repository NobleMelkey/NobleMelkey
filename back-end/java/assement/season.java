package assement;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the month");
	int a=s.nextInt();
	while(a<5) {
		System.out.println("summer: "+a);
		break;
	}
	while(a>4&&a<9) {
		System.out.println("rainy: "+a);
		break;
	}
	while(a>8&&a<13) {
		System.out.println("winter: "+a);
		break;
	}
	while(a>12) {
		System.out.println("invaild num: "+a);
		break;
	}
	
	
	}

}
