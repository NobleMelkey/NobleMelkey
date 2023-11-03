package Test_ques;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,sum=0;
		Scanner s= new Scanner(System.in);
		String strl=s.next();
		for(int i=0; i<strl.length(); i++)
		{
			if(Character.isDigit(strl.charAt(i))) {
				b=Integer.parseInt(String.valueOf(strl.charAt(i)));
				sum=sum+b;
			}
		}
		System.out.println(sum);
				

	}

}
