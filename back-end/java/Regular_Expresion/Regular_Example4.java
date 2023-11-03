package Regular_Expresion;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regular_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		System.out.println("metacharacters D....");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "m"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
	}

}
