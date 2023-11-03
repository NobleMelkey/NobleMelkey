package Regular_Expresion;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class case_insensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	    System.out.print("enter the string:");
	    String str1=s.nextLine();
		Pattern p=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("Welcome javaTraining");
		boolean matchFound=m.find();
		if(matchFound)
		{
			System.out.println("match Found");
		}
		else
		{
			System.out.println("match not Found");
		}
		
		
		

	}

}
