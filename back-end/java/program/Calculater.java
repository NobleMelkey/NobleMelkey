package program;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the number:");
		
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		System.out.println("enter an operater(+,-,*,/");
		char operator = reader.next().charAt(0);
		double result=0;
		switch(operator)
		{
			case '+':
				result=first+second;
				break;
			case '-':
				result=first+second;
				break;
			case '*':
				result=first+second;
				break;
			case '/':
				result=first+second;
				break;
				default:
					System.out.printf("error! operater is not correct");
					
			
		}
		System.out.printf("%.1f %c %.1f =%.1f",first,operator,second,result);
		
	}

}
